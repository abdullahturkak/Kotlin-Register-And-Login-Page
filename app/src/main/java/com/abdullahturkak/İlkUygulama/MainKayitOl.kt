package com.abdullahturkak.İlkUygulama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_kayit_ol.*

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kayit_ol)

        kayitgeributton.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

        kaydetButon.setOnClickListener {

        var kullanicibilgisi=kayitKullaniciAdi.text.toString()
        var kullanıcıparola=kayitSifre.text.toString()
        var SharedPreferences = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
        var editor = SharedPreferences.edit()
        editor.putString("kullaniciadi","$kullanicibilgisi").apply()
        editor.putString("parola","$kullanıcıparola").apply()
        Toast.makeText(applicationContext,"Kayıt Başarılı", Toast.LENGTH_LONG).show()
        kayitKullaniciAdi.text.clear()
        kayitSifre.text.clear()
        }
    }
}