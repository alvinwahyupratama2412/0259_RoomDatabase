package com.au.pertemuan_9.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tblSiswa")
data class Siswa(
        @PrimaryKey(autoGenerate = true)
        val id : int = 0,
        val nama : String,
        val alamat : String,
        val telpon : String
)
