package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val animalname = intent.getStringExtra(MainActivity.KEY_Animalname)
        val animaldesc = intent.getStringExtra(MainActivity.KEY_Animaldesc)
        val aname = findViewById<TextView>(R.id.tvnameanimal)
        val adesc = findViewById<TextView>(R.id.tvdescanimal)
        aname.text = animalname
        adesc.text = animaldesc
    }
}