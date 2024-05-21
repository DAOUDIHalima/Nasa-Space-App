package com.mobiledev.nasaspaceapp.view.astronomy

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.GetAstronomyUseCase
import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.UpdateAstronomyUseCase

class AstronomyViewModelFactory(
    private val getAstronomyUseCase: GetAstronomyUseCase,
    private val updateAstronomyUseCase: UpdateAstronomyUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AstronomyViewModel(getAstronomyUseCase, updateAstronomyUseCase) as T
    }
}