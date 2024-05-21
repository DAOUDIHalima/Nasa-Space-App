package com.mobiledev.nasaspaceapp.domain.astronomy.usecase

import com.mobiledev.nasaspaceapp.domain.astronomy.repository.AstronomyRepository
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

class UpdateAstronomyUseCase(
    private val astronomyRepository: AstronomyRepository
) {

    suspend fun execute() : List<Astronomy>? = astronomyRepository.updateAstronomyDataFromRepository()
}