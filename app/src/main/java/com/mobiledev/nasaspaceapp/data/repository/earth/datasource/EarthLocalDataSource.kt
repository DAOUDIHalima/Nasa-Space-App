package com.mobiledev.nasaspaceapp.data.repository.earth.datasource

import com.mobiledev.nasaspaceapp.model.earth.EarthDetail

interface EarthLocalDataSource {

    suspend fun getEarthDataFromLocal() : List<EarthDetail>
    suspend fun saveEarthDataToLocal(earthData : List<EarthDetail>)
    suspend fun clearEarthDataFromLocal()
}