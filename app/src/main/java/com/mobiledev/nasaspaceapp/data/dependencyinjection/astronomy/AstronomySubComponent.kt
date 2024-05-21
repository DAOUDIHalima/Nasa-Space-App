package com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy

import com.mobiledev.nasaspaceapp.view.astronomy.AstronomyFragment
import dagger.Subcomponent

@AstronomyScope
@Subcomponent(modules = [AstronomyModule::class])
interface AstronomySubComponent {

    fun inject(astronomyFragment: AstronomyFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create() : AstronomySubComponent
    }

}