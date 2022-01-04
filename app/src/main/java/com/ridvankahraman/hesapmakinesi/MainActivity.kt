package com.ridvankahraman.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btntoplama = findViewById<Button>(R.id.btntoplama)
        var btncikarma = findViewById<Button>(R.id.btncikarma)
        var btncarpma = findViewById<Button>(R.id.btncarpma)
        var btnbolme = findViewById<Button>(R.id.btnbolme)
        var ilksayi = findViewById<EditText>(R.id.ilksayi)
        var ikincisayi = findViewById<EditText>(R.id.ikincisayi)
        var txtsonuc = findViewById<TextView>(R.id.txtsonuc)

        btntoplama.setOnClickListener {
            if (ilksayi.text.toString() != "" && ikincisayi.text.toString() != ""){
                txtsonuc.text = (ilksayi.text.toString().toInt()+ikincisayi.text.toString().toInt()).toString()
            }
        }
        btncikarma.setOnClickListener {
            if (ilksayi.text.toString() != "" && ikincisayi.text.toString() != "") {
                txtsonuc.text = (ilksayi.text.toString().toInt() - ikincisayi.text.toString().toInt()).toString()
            }
        }
        btncarpma.setOnClickListener {
            if (ilksayi.text.toString() != "" && ikincisayi.text.toString() != "") {
                txtsonuc.text = (ilksayi.text.toString().toInt() * ikincisayi.text.toString().toInt()).toString()
            }
        }
        btnbolme.setOnClickListener {
            if (ilksayi.text.toString() != "" && ikincisayi.text.toString() != "") {
                txtsonuc.text = (ilksayi.text.toString().toInt() / ikincisayi.text.toString().toInt()).toString()
            }
        }

    }
}