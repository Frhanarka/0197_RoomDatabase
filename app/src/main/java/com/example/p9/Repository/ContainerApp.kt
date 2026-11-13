package com.example.p9.Repository

import android.content.Context
import com.example.p9.room.DatabaseSiswa
import com.example.p9.roomdb.DatabaseSiswa
import kotlin.getValue

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}