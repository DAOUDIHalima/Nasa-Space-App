package com.mobiledev.nasaspaceapp.data.dependencyinjection.earth

import com.mobiledev.nasaspaceapp.domain.earth.usecase.GetEarthUseCase
import com.mobiledev.nasaspaceapp.view.earth.EarthViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class EarthModule {

    @EarthScope
    @Provides
    fun provideEarthViewModelFactory(
        getEarthUseCase: GetEarthUseCase,
    ) : EarthViewModelFactory {
        return EarthViewModelFactory(
           getEarthUseCase
        )
    }
}