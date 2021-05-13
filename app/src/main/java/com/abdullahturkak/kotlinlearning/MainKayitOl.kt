package com.abdullahturkak.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_giris_yap.*
import kotlinx.android.synthetic.main.activity_main_kayit_ol.*

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kayit_ol)

        kayitGeriDon.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Ana Sayfaya Yönlendiriliyorsunuz!", Toast.LENGTH_LONG).show()
        }
    }
}