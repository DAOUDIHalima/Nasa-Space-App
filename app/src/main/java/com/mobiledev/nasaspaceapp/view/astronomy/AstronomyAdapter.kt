package com.mobiledev.nasaspaceapp.view.astronomy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mobiledev.nasaspaceapp.R
import com.mobiledev.nasaspaceapp.databinding.CardAstronomyBinding
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

class AstronomyAdapter : RecyclerView.Adapter<AstronomyViewHolder>() {

    private val astronomyList = ArrayList<Astronomy>()

    fun setAstronomyList(astronomers: List<Astronomy>) {
        astronomyList.clear()
        astronomyList.addAll(astronomers)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AstronomyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : CardAstronomyBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.card_astronomy,
            parent,
            false
        )
        return AstronomyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return astronomyList.size
    }

    override fun onBindViewHolder(holder: AstronomyViewHolder, position: Int) {
        holder.bind(astronomyList[position])
    }
}

