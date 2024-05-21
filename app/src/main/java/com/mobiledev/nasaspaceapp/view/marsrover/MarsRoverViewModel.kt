package com.mobiledev.nasaspaceapp.view.marsrover

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mobiledev.nasaspaceapp.domain.marsrover.usecase.GetMarsRoverUseCase
import com.mobiledev.nasaspaceapp.domain.marsrover.usecase.UpdateMarsRoverUseCase

class MarsRoverViewModel(
    private val getMarsRoverUseCase : GetMarsRoverUseCase,
    private val updateMarsRoverUseCase: UpdateMarsRoverUseCase
) : ViewModel() {

    fun getMarsRoverData(page : Int) = liveData {
        val marsRoveData = getMarsRoverUseCase.execute(page)
        emit(marsRoveData)
    }

    fun updateMarsRoverData(page : Int) = liveData {
        val marsRoveData = updateMarsRoverUseCase.execute(page)
        emit(marsRoveData)
    }
}