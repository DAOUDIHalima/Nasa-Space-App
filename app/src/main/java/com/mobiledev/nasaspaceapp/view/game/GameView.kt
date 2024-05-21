package com.mobiledev.nasaspaceapp


import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class GameView(var c : Context, var gameTask: GameTask): View(c)

{
    private var myPaint: Paint? = null
    private var speed = 1
    private var  time = 0
    private var score = 0
    private var myAstronautePosition = 0
    private val otherclipart = ArrayList<HashMap<String,Any>>()

    var viewWidth = 0
    var viewHeight = 0
    init {
        myPaint = Paint()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        viewWidth = this.measuredWidth
        viewHeight = this.measuredHeight

        if(time % 700 < 10+speed){
            val map = HashMap<String,Any>()
            map["lane"]= (0..2).random()
            map["startTime"] = time
            otherclipart.add(map)
        }
        time = time +10 +speed
        val astronauteWidth = viewWidth /5
        val astronauteHeight = astronauteWidth + 10
        myPaint!!.style = Paint.Style.FILL
        val d = resources.getDrawable(R.drawable.astronaute2, null)
        d.setBounds(
            myAstronautePosition * viewWidth /3 + viewWidth / 15 + 25,
            viewHeight-2 - astronauteHeight,
            myAstronautePosition * viewWidth /3 + viewWidth / 15 + astronauteWidth - 25,
            viewHeight-2
        )
        d.draw(canvas!!)
        myPaint!!.color = Color.BLUE
        var highScore = 0
        for(i in otherclipart.indices){
            try {
                val astronauteX = otherclipart[i]["lane"] as Int * viewWidth / 3 + viewWidth / 15
                var astronauteY = time - otherclipart[i]["startTime"] as Int
                val d2 = resources.getDrawable(R.drawable.clipart, null)

                d2.setBounds(
                    astronauteX + 25,
                    astronauteY - astronauteHeight,
                    astronauteX + astronauteWidth - 25,
                    astronauteY

                )
                d2.draw(canvas)
                if (otherclipart[i]["lane"] as Int == myAstronautePosition) {
                    if (astronauteY > viewHeight - 2 - astronauteHeight
                        && astronauteY < viewHeight - 2
                    ) {
                        gameTask.closeGame(score)

                    }
                }
                if(astronauteY > viewHeight + astronauteHeight){
                    otherclipart.removeAt(i)
                    score++
                    speed = 1 +Math.abs(score / 8)
                    if(score > highScore){
                        highScore = score
                    }

                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }
        myPaint!!.color = Color.WHITE
        myPaint!!.textSize = 40f
        canvas.drawText("Score : $score", 80f, 80f,myPaint!!)
        canvas.drawText("Speed : $speed", 380f, 80f,myPaint!!)
        invalidate()



    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event!!.action){
            MotionEvent.ACTION_DOWN ->{
                val x1 = event.x
                if (x1 < viewWidth/2){
                    if (myAstronautePosition >  0){
                        myAstronautePosition--
                    }
                }
                if (x1 > viewWidth/2){
                    if (myAstronautePosition < 2){
                        myAstronautePosition++
                    }
                }
                invalidate()
            }
            MotionEvent.ACTION_UP ->{
                /*val x1 = event.x
                if (x1 < viewWidth/2){
                    if (myAstronautePosition >  0){
                        myAstronautePosition--
                    }
                }
                if (x1 > viewWidth/2){
                    if (myAstronautePosition < 2){
                        myAstronautePosition++
                    }
                }
                invalidate(*/
            }

        }
        return true
    }



}