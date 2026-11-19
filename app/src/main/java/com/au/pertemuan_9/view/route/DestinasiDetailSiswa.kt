package com.au.pertemuan_9.view.route

import com.au.pertemuan_9.R
import com.au.pertemuan_9.uicontroller.DestinasiNavigasi

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_edit"

    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}