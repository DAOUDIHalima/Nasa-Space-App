package com.mobiledev.nasaspaceapp.domain.marsrover.usecase

import com.mobiledev.nasaspaceapp.domain.marsrover.repository.MarsRoverRepository
import com.mobiledev.nasaspaceapp.model.marsrover.MarsRoverDetail

class GetMarsRoverUseCase(
    private val marsRoverRepository: MarsRoverRepository
) {
    suspend fun execute(page : Int) : List<MarsRoverDetail>? = marsRoverRepository.getMarsRoverDataFromRepository(page)
}