package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl

import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyCacheDataSource
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy

class AstronomyCacheDataSourceImpl : AstronomyCacheDataSource {

    private var astronomyList = ArrayList<Astronomy>()

    override suspend fun getAstronomyDataFromCache(): List<Astronomy> {
        return astronomyList
    }

    override suspend fun saveAstronomyDataToCache(astronomyData: List<Astronomy>) {
        astronomyList.clear()
        astronomyList = ArrayList(astronomyData)
    }
}