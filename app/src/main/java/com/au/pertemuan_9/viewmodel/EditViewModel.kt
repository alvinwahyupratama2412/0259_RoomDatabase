package com.au.pertemuan_9.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.au.pertemuan_9.repositori.RepositoriSiswa
import com.au.pertemuan_9.view.route.DestinasiDetailSiswa


class EditViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
    private set


}
