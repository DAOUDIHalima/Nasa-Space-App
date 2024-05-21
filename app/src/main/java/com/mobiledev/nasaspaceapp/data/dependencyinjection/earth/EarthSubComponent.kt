package com.mobiledev.nasaspaceapp.data.dependencyinjection.earth

import com.mobiledev.nasaspaceapp.view.earth.EarthFragment
import dagger.Subcomponent

@EarthScope
@Subcomponent(modules = [EarthModule::class])
interface EarthSubComponent {

    fun inject(earthFragment: EarthFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create() : EarthSubComponent
    }

}