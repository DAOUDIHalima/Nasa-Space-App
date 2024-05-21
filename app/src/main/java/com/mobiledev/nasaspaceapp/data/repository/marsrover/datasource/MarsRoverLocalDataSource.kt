package com.mobiledev.nasaspaceapp.data.repository.marsrover.datasource

import com.mobiledev.nasaspaceapp.model.marsrover.MarsRoverDetail

interface MarsRoverLocalDataSource {

    suspend fun getMarsRoverDataFromLocal() : List<MarsRoverDetail>
    suspend fun saveMarsRoverDataToLocal(marsRoverData : List<MarsRoverDetail>)
    suspend fun clearMarsRoverDataFromLocal()
}