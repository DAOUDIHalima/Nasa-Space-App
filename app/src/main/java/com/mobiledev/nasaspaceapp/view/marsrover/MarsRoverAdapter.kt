package com.mobiledev.nasaspaceapp.view.marsrover

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mobiledev.nasaspaceapp.R
import com.mobiledev.nasaspaceapp.databinding.CardMarsRoverBinding
import com.mobiledev.nasaspaceapp.model.marsrover.MarsRoverDetail

class MarsRoverAdapter : RecyclerView.Adapter<MarsRoverViewHolder>() {

    private var marsRoverList = ArrayList<MarsRoverDetail>()

    fun setMarsRoverDetailList(listMarsRover: List<MarsRoverDetail>) {
        marsRoverList.clear()
        marsRoverList.addAll(listMarsRover)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsRoverViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : CardMarsRoverBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.card_mars_rover,
            parent,
            false
        )
        return MarsRoverViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MarsRoverViewHolder, position: Int) {
        holder.bind(marsRoverList[position])
    }

    override fun getItemCount(): Int {
        return marsRoverList.size
    }

}