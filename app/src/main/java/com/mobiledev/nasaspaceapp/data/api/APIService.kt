package com.mobiledev.nasaspaceapp.data.api

import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy
import com.mobiledev.nasaspaceapp.model.earth.Earth
import com.mobiledev.nasaspaceapp.model.marsrover.MarsRover
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {

    @GET("planetary/apod?count=20")
    suspend fun getAstronomersFromAPI(@Query("api_key") apiKey : String) : Response<List<Astronomy>>

    @GET("mars-photos/api/v1/rovers/curiosity/photos?sol=1000")
    suspend fun getMarsRoverDataFromAPI(
        @Query("page") page : Int,
        @Query("api_key") apiKey: String
    ) : Response<MarsRover>

    // https://api.nasa.gov/EPIC/api/natural/date/2023-05-13
    @GET("EPIC/api/natural/date/{today_date}")
    suspend fun getEarthFromAPI(
        @Path("today_date") todayDate: String,
        @Query("api_key") apiKey: String
    ) : Response<Earth>

}