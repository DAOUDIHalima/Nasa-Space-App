package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import com.mobiledev.nasaspaceapp.data.repository.astronomy.AstronomyRepositoryImpl
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyCacheDataSource
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyRemoteDataSource
import com.mobiledev.nasaspaceapp.data.repository.earth.EarthRepositoryImpl
import com.mobiledev.nasaspaceapp.data.repository.earth.datasource.EarthLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.earth.datasource.EarthRemoteDataSource
import com.mobiledev.nasaspaceapp.data.repository.marsrover.MarsRoverRepositoryImpl
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasource.MarsRoverLocalDataSource
import com.mobiledev.nasaspaceapp.data.repository.marsrover.datasource.MarsRoverRemoteDataSource
import com.mobiledev.nasaspaceapp.domain.astronomy.repository.AstronomyRepository
import com.mobiledev.nasaspaceapp.domain.earth.repository.EarthRepository
import com.mobiledev.nasaspaceapp.domain.marsrover.repository.MarsRoverRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAstronomyRepository(
        astronomyRemoteDataSource: AstronomyRemoteDataSource,
        astronomyLocalDataSource: AstronomyLocalDataSource,
        astronomyCacheDataSource: AstronomyCacheDataSource
    ) : AstronomyRepository {
        return AstronomyRepositoryImpl(
            astronomyRemoteDataSource,
            astronomyLocalDataSource,
            astronomyCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideMarsRoverRepository(
        marsRoverRemoteDataSource: MarsRoverRemoteDataSource,
        marsRoverLocalDataSource: MarsRoverLocalDataSource
    ) : MarsRoverRepository {
        return MarsRoverRepositoryImpl(
            marsRoverRemoteDataSource,
            marsRoverLocalDataSource
        )
    }

    @Provides
    @Singleton
    fun provideEarthRepository(
        earthRemoteDataSource: EarthRemoteDataSource,
        earthLocalDataSource: EarthLocalDataSource
    ) : EarthRepository {
        return EarthRepositoryImpl(
            earthRemoteDataSource,
            earthLocalDataSource
        )
    }
}