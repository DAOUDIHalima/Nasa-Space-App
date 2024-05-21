package com.mobiledev.nasaspaceapp.domain.earth.usecase

import com.mobiledev.nasaspaceapp.domain.earth.repository.EarthRepository
import com.mobiledev.nasaspaceapp.model.earth.EarthDetail

class GetEarthUseCase(
    private val earthRepository: EarthRepository
) {
    suspend fun execute(todayDate : String) : List<EarthDetail>? = earthRepository.getEarthDataFromRepository(todayDate)
}