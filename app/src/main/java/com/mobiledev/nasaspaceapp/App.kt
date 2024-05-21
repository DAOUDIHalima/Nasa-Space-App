package com.mobiledev.nasaspaceapp

import android.app.Application
import com.mobiledev.nasaspaceapp.data.dependencyinjection.Injector
import com.mobiledev.nasaspaceapp.data.dependencyinjection.astronomy.AstronomySubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.core.*
import com.mobiledev.nasaspaceapp.data.dependencyinjection.earth.EarthSubComponent
import com.mobiledev.nasaspaceapp.data.dependencyinjection.marsrover.MarsRoverSubComponent
import com.mobiledev.nasaspaceapp.util.AppConstant

class App : Application(), Injector {

    private lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(AppConstant.BASE_URL))
            .remoteDataModule(RemoteDataModule(AppConstant.API_KEY))
            .build()

    }

//    override fun createHomeSubComponent(): HomeSubComponent {
//        return appComponent.homeSubComponent().create()
//    }
    override fun createAstronomySubComponent(): AstronomySubComponent {
        return appComponent.astronomySubComponent().create()
    }

    override fun createMarsRoverSubComponent(): MarsRoverSubComponent {
        return appComponent.marsRoverSubComponent().create()
    }

    override fun createEarthSubComponent(): EarthSubComponent {
        return appComponent.earthSubComponent().create()
    }
}