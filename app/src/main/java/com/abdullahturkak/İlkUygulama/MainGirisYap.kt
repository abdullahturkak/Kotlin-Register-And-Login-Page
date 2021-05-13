package com.abdullahturkak.İlkUygulama

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_giris_yap.*

class MainGirisYap : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_giris_yap)
        preferences = getSharedPreferences("bilgiler.xml", MODE_PRIVATE)

        girisgeributton.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

        girisKayitButon.setOnClickListener {
            intent = Intent(applicationContext, MainKayitOl::class.java)
            startActivity(intent)
        }
        

        girisGirisButon.setOnClickListener {
            var kayitlibilgi = preferences.getString("kullaniciadi","")
            var kayitliparola = preferences.getString("parola","")
            var giriskullanici=kullaniciadi.text.toString()
            var girisparola=sifre.text.toString()
            println(kayitlibilgi)
            println(kayitliparola)

            if ((kayitlibilgi==giriskullanici)&&(kayitliparola==girisparola)){
                intent= Intent(applicationContext,MainUserAccount::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, "Giriş Bilgileri Hatalı", Toast.LENGTH_LONG).show()
            }

        }
        }
    }
