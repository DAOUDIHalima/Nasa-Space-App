package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource

import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy
import retrofit2.Response

interface AstronomyRemoteDataSource {
    suspend fun getAstronomyDataFromRemote() : Response<List<Astronomy>>
}