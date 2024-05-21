package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource

import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

interface AstronomyCacheDataSource {
    suspend fun getAstronomyDataFromCache() : List<Astronomy>
    suspend fun saveAstronomyDataToCache(astronomyData : List<Astronomy>)
}