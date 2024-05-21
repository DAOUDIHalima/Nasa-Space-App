package com.mobiledev.nasaspaceapp.domain.astronomy.repository

import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

interface AstronomyRepository {
    suspend fun getAstronomyDataFromRepository() : List<Astronomy>?
    suspend fun updateAstronomyDataFromRepository() : List<Astronomy>?
}