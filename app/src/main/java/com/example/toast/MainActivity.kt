package com.example.toast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan" , Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.tombolToast)
        val tombol1 = findViewById<Button>(R.id.tombolToast1)
        val tombol2 = findViewById<Button>(R.id.tombolToast2)

        tombol.setOnClickListener {
            Toast.makeText(this, "Febi Aryadi", Toast.LENGTH_SHORT).show()

        tombol1.setOnClickListener {
            Toast.makeText(this, "XI PPLG 1", Toast.LENGTH_SHORT).show()

        tombol2.setOnClickListener {
            Toast.makeText(this, "2233255", Toast.LENGTH_SHORT).show()
        }
            }

        }

    }
}