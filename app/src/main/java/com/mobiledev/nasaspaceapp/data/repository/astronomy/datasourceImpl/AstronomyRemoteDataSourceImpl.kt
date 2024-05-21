package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl

import com.mobiledev.nasaspaceapp.data.api.APIService
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyRemoteDataSource
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy
import retrofit2.Response

class AstronomyRemoteDataSourceImpl(
    private val apiService: APIService,
    private val apiKey : String
) : AstronomyRemoteDataSource {
    override suspend fun getAstronomyDataFromRemote(): Response<List<Astronomy>> {
        return apiService.getAstronomersFromAPI(apiKey)
    }
}