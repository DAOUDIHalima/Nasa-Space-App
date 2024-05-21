package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource

import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

interface AstronomyLocalDataSource {
    suspend fun getAstronomyDataFromLocal() : List<Astronomy>
    suspend fun saveAstronomyDataToLocal(astronomyData : List<Astronomy>)
    suspend fun clearAstronomyDataFromLocal()
}