package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import com.mobiledev.nasaspaceapp.data.database.AstronomyDao
import com.mobiledev.nasaspaceapp.data.database.EarthDao
import com.mobiledev.nasaspaceapp.data.database.MarsRoverDao
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl.AstronomyLocalDataSourceImpl
import com.mobiledev.nasaspaceapp.data.repository.earth.datasource.EarthLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.earth.datasourceImpl.EarthLocalDataSourceImpl
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasource.MarsRoverLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasourceImpl.MarsRoverLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideAstronomyLocalDataSource(astronomyDao: AstronomyDao) : AstronomyLocalDataSource {
        return AstronomyLocalDataSourceImpl(astronomyDao)
    }

    @Singleton
    @Provides
    fun provideMarsRoverLocalDataSource(marsRoverDao: MarsRoverDao) : MarsRoverLocalDataSource {
        return MarsRoverLocalDataSourceImpl(marsRoverDao)
    }

    @Singleton
    @Provides
    fun provideEarthLocalDataSource(earthDao: EarthDao) : EarthLocalDataSource {
        return EarthLocalDataSourceImpl(earthDao)
    }
}