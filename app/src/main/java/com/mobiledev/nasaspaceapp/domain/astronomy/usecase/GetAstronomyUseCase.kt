package com.mobiledev.nasaspaceapp.domain.astronomy.usecase

import com.mobiledev.nasaspaceapp.domain.astronomy.repository.AstronomyRepository
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

class GetAstronomyUseCase(
    private val astronomyRepository: AstronomyRepository
) {
    suspend fun execute() : List<Astronomy>? = astronomyRepository.getAstronomyDataFromRepository()
}