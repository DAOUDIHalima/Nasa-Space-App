package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyCacheDataSource
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl.AstronomyCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideAstronomyCacheDataSource() : AstronomyCacheDataSource {
        return AstronomyCacheDataSourceImpl()
    }
}