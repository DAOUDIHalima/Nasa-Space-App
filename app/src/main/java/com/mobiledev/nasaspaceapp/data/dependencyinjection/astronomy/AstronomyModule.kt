package com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy

import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.GetAstronomyUseCase
import com.mobiledev.nasaspaceapp.domain.astronomy.usecase.UpdateAstronomyUseCase
import com.mobiledev.nasaspaceapp.view.astronomy.AstronomyViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AstronomyModule {

    @AstronomyScope
    @Provides
    fun provideAstronomyViewModelFactory(
        getAstronomyUseCase: GetAstronomyUseCase,
        updateAstronomyUseCase: UpdateAstronomyUseCase
    ) : AstronomyViewModelFactory {
        return AstronomyViewModelFactory(
            getAstronomyUseCase,
            updateAstronomyUseCase
        )
    }
}