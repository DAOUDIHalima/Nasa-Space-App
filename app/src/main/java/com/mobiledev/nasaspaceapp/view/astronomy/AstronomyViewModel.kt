package com.mobiledev.nasaspaceapp.view.astronomy

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.GetAstronomyUseCase
import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.UpdateAstronomyUseCase

class AstronomyViewModel(
    private val getAstronomyUseCase: GetAstronomyUseCase,
    private val updateAstronomyUseCase: UpdateAstronomyUseCase
) : ViewModel() {

    fun getAstronomyData() = liveData {
        val astronomyList = getAstronomyUseCase.execute()
        emit(astronomyList)
    }

    fun updateAstronomyData() = liveData {
        val astronomyList = updateAstronomyUseCase.execute()
        emit(astronomyList)
    }
}