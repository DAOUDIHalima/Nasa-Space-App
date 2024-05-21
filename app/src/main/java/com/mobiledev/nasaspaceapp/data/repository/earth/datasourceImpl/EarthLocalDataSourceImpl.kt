package com.mobiledev.nasaspaceapp.data.repository.earth.datasourceImpl

import com.mobiledev.nasaspaceapp.data.database.EarthDao
import com.mobiledev.nasaspaceapp.data.repository.earth.datasource.EarthLocalDataSource
import com.mobiledev.nasaspaceapp.model.earth.EarthDetail
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EarthLocalDataSourceImpl(
    private val earthDao: EarthDao
) : EarthLocalDataSource {

    override suspend fun getEarthDataFromLocal(): List<EarthDetail> {
        return earthDao.getAllEarthData()
    }

    override suspend fun saveEarthDataToLocal(earthData: List<EarthDetail>) {
        CoroutineScope(Dispatchers.IO).launch {
            earthDao.saveEarthData(earthData)
        }
    }

    override suspend fun clearEarthDataFromLocal() {
        CoroutineScope(Dispatchers.IO).launch {
            earthDao.deleteAllEarthData()
        }
    }
}