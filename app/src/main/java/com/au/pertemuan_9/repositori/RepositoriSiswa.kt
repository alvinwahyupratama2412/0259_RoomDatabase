package com.au.pertemuan_9.repositori

import com.au.pertemuan_9.room.Siswa
import com.au.pertemuan_9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa{
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

