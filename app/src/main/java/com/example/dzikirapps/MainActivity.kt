package com.example.dzikirapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var llSunnahQauliyah: LinearLayout
    private lateinit var llDzikirSetiapSaat: LinearLayout
    private lateinit var llDzikirDoaHarian: LinearLayout
    private lateinit var llDzikirPagiPetang: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llSunnahQauliyah = findViewById(R.id.ll_sunnahQauliyah)
        llSunnahQauliyah.setOnClickListener(this)
        llDzikirDoaHarian= findViewById(R.id.ll_dzikir_doa_harian)
        llDzikirDoaHarian.setOnClickListener(this)
        llDzikirSetiapSaat = findViewById(R.id.ll_dzikir_setiap_saat)
        llDzikirSetiapSaat.setOnClickListener(this)
        llDzikirPagiPetang= findViewById(R.id.ll_dzikir_pagi_petang)
        llDzikirPagiPetang.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.ll_sunnahQauliyah -> startActivity(Intent(this, QauliyahShalatActivity::class.java))
            R.id.ll_dzikir_doa_harian -> startActivity(Intent(this, HarianDzikirDoaActivity::class.java))
            R.id.ll_dzikir_setiap_saat -> startActivity(Intent(this, SetiapSaatDzikirActivity::class.java))
            R.id.ll_dzikir_pagi_petang -> startActivity(Intent(this, DzikirPagiActivity::class.java))

        }
    }

}