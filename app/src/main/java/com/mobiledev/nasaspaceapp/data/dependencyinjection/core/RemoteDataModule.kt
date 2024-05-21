package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import com.mobiledev.nasaspaceapp.data.api.APIService
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyRemoteDataSource
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl.AstronomyRemoteDataSourceImpl
import com.mobiledev.nasaspaceapp.data.repository.earth.datasource.EarthRemoteDataSource
import com.mobiledev.nasaspaceapp.data.repository.earth.datasourceImpl.EarthRemoteDataSourceImpl
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasource.MarsRoverRemoteDataSource
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasourceImpl.MarsRoverRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(
    private val apiKey : String
) {

    @Singleton
    @Provides
    fun provideAstronomyRemoteDataSource(apiService: APIService) : AstronomyRemoteDataSource {
        return AstronomyRemoteDataSourceImpl(apiService, apiKey)
    }

    @Singleton
    @Provides
    fun provideMarsRoverRemoteDataSource(apiService: APIService) : MarsRoverRemoteDataSource {
        return MarsRoverRemoteDataSourceImpl(apiService, apiKey)
    }

    @Singleton
    @Provides
    fun provideEarthRemoteDataSource(apiService: APIService) : EarthRemoteDataSource {
        return EarthRemoteDataSourceImpl(apiService, apiKey)
    }
}