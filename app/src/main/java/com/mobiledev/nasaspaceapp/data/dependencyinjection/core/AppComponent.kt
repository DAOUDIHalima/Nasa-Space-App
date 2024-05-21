package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy.AstronomySubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.earth.EarthSubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover.MarsRoverSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DatabaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class
    ]
)
interface AppComponent {

    fun astronomySubComponent() : AstronomySubComponent.Factory
    fun marsRoverSubComponent() : MarsRoverSubComponent.Factory
    fun earthSubComponent() : EarthSubComponent.Factory

}