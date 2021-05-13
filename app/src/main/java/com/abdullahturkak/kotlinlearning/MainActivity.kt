package com.abdullahturkak.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_giris_yap.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        anaSayfaGiris.setOnClickListener {
            intent= Intent(applicationContext,MainGirisYap::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Giriş Yap Sayfasına Yönlendiriliyorsunuz!", Toast.LENGTH_LONG).show()
        }



        anaSayfaKayıt.setOnClickListener {
            intent= Intent(applicationContext,MainKayitOl::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Sayfaya Gidildi", Toast.LENGTH_LONG).show()
        }





    }
}