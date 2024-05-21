package com.mobiledev.nasaspaceapp.data.dependencyinjection.core

import android.content.Context
import com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy.AstronomySubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.earth.EarthSubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover.MarsRoverSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [AstronomySubComponent::class, MarsRoverSubComponent::class, EarthSubComponent::class])
class AppModule(
    private val context: Context
) {

    @Singleton
    @Provides
    fun provideApplicationContext() : Context {
        return context.applicationContext
    }
}