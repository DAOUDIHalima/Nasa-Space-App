package com.mobiledev.nasaspaceapp.domain.marsrover.repository

import com.mobiledev.nasaspaceapp.model.marsrover.MarsRoverDetail

interface MarsRoverRepository {

    suspend fun getMarsRoverDataFromRepository(page : Int) : List<MarsRoverDetail>?

    suspend fun updateMarsRoverDataFromRepository(page : Int) : List<MarsRoverDetail>?

}