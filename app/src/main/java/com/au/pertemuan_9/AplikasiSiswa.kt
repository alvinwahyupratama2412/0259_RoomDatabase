package com.au.pertemuan_9


import android.app.Application
import com.au.pertemuan_9.repositori.ContainerApp
import com.au.pertemuan_9.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}
