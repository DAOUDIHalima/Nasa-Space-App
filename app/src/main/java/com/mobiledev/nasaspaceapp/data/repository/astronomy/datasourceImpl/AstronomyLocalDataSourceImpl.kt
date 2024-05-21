package com.mobiledev.nasaspaceapp.data.repository.astronomy.datasourceImpl

import com.mobiledev.nasaspaceapp.data.database.AstronomyDao
import com.mobiledev.nasaspaceapp.data.repository.astronomy.datasource.AstronomyLocalDataSource
import com.mobiledev.nasaspaceapp.model.astronomy.Astronomy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AstronomyLocalDataSourceImpl(
    private val astronomyDao: AstronomyDao
) : AstronomyLocalDataSource {

    override suspend fun getAstronomyDataFromLocal(): List<Astronomy> {
        return astronomyDao.getAllAstronomyData()
    }

    override suspend fun saveAstronomyDataToLocal(astronomyData: List<Astronomy>) {
        CoroutineScope(Dispatchers.IO).launch {
            astronomyDao.saveAstronomyData(astronomyData)
        }
    }

    override suspend fun clearAstronomyDataFromLocal() {
        CoroutineScope(Dispatchers.IO).launch {
            astronomyDao.deleteAllAstronomyData()
        }
    }
}