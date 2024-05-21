package com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover

import com.mobiledev.nasaspaceapp.view.marsrover.MarsRoverFragment
import dagger.Subcomponent

@MarsRoverScope
@Subcomponent(modules = [MarsRoverModule::class])
interface MarsRoverSubComponent {

    fun inject(marsRoverFragment: MarsRoverFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create() : MarsRoverSubComponent
    }
}