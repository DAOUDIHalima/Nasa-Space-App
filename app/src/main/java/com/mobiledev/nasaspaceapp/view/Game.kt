package com.mobiledev.nasaspaceapp.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mobiledev.nasaspaceapp.GameTask
import com.mobiledev.nasaspaceapp.GameView
import com.mobiledev.nasaspaceapp.R
import com.mobiledev.nasaspaceapp.R.id.gameFragmentt

class Game : Fragment(), GameTask {
    private lateinit var rootLayout: FrameLayout
    private lateinit var startBtn: Button
    private lateinit var mGameView: GameView
    private lateinit var score: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        startBtn = view.findViewById(R.id.startBtn)
        rootLayout = view.findViewById(gameFragmentt)
        score = view.findViewById(R.id.score)
        mGameView = GameView(requireContext(), this)

        startBtn.setOnClickListener {
            mGameView.setBackgroundResource(R.drawable.backgroundgame)
            rootLayout.addView(mGameView)
            startBtn.visibility = View.GONE
            score.visibility = View.GONE
        }

        return view
    }

    override fun closeGame(mScore: Int) {
        score.text = "Score :$mScore"
        rootLayout.removeView(mGameView)
        startBtn.visibility = View.VISIBLE
        score.visibility = View.VISIBLE
    }

}
