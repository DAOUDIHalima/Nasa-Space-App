package com.mobiledev.nasaspaceapp.domain.earth.repository

import com.mobiledev.nasaspaceapp.model.earth.EarthDetail

interface EarthRepository {

    suspend fun getEarthDataFromRepository(todayDate : String) : List<EarthDetail>?

}