package com.example.dzikirapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyahSholat = findViewById<RecyclerView>(R.id.rv_qauliyah_sholat)
        rvQauliyahSholat.layoutManager = LinearLayoutManager(this)
        rvQauliyahSholat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }
}