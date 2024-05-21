package com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover

import com.mobiledev.nasaspaceapp.domain.marsrover.usecase.GetMarsRoverUseCase
import com.mobiledev.nasaspaceapp.domain.marsrover.usecase.UpdateMarsRoverUseCase
import com.mobiledev.nasaspaceapp.view.marsrover.MarsRoverViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MarsRoverModule {

    @MarsRoverScope
    @Provides
    fun provideMarsRoverViewModelFactory(
        getMarsRoverUseCase: GetMarsRoverUseCase,
        updateMarsRoverUseCase: UpdateMarsRoverUseCase
    ) : MarsRoverViewModelFactory {
        return MarsRoverViewModelFactory(
            getMarsRoverUseCase,
            updateMarsRoverUseCase
        )
    }
}