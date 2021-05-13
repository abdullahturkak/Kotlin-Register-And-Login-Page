package com.abdullahturkak.İlkUygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        anaSayfaGiris.setOnClickListener {
            intent= Intent(applicationContext,MainGirisYap::class.java)
            startActivity(intent)
        }



        anaSayfaKayıt.setOnClickListener {
            intent= Intent(applicationContext,MainKayitOl::class.java)
            startActivity(intent)
        }





    }
}