package com.mobiledev.nasaspaceapp.data.dependencyinjection

import com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy.AstronomySubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.earth.EarthSubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover.MarsRoverSubComponent

interface Injector {

    fun createAstronomySubComponent() : AstronomySubComponent

    fun createMarsRoverSubComponent() : MarsRoverSubComponent

    fun createEarthSubComponent() : EarthSubComponent

}