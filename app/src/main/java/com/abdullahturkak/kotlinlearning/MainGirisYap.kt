package com.abdullahturkak.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_giris_yap.*

class MainGirisYap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_giris_yap)

        girisKayitButon.setOnClickListener {
            intent= Intent(applicationContext,MainKayitOl::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Kayıt Ol Sayfasına Yönlendiriliyorsunuz!", Toast.LENGTH_LONG).show()


        girisGirisButon.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Hoş Geldiniz Sayfasına Yönlendiriliyorsunuz!", Toast.LENGTH_LONG).show()
            }
        }
    }
}