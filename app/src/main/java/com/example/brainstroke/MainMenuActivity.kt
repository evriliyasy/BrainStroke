package com.example.brainstroke

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainMenuActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnTentang = findViewById<CardView>(R.id.btnTentang)
        btnTentang.setOnClickListener {
            val intent = Intent(this, TentangActivity::class.java)
            startActivity(intent)
        }

        val btnDataset = findViewById<CardView>(R.id.btnDataset)
        btnDataset.setOnClickListener {
            val intent = Intent(this, DatasetActivity::class.java)
            startActivity(intent)
        }

        val btnFitur = findViewById<CardView>(R.id.btnFitur)
        btnFitur.setOnClickListener {
            val intent = Intent(this, FiturActivity::class.java)
            startActivity(intent)
        }

        val btnModel = findViewById<CardView>(R.id.btnModel)
        btnModel.setOnClickListener {
            val intent = Intent(this, ModelActivity::class.java)
            startActivity(intent)
        }

        val btnSimodel = findViewById<CardView>(R.id.btnSimulasiModel)
        btnSimodel.setOnClickListener {
            val intent = Intent(this, SimodelActivity::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<CardView>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}