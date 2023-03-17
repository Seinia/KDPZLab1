package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Animal
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat: Animal = Animal(
            "Пірат",
            "Пірат дуже чемний кіт, має гладку шерсть, дуже багато спить, але полюбляє гратися з дітьми.",
            "Чемний котик"
        )
        val dog: Animal = Animal(
            "Манчестер",
            "Манчестер доволі чемний собака, але все ж може побавитися в домі і залишити безлад.",
            "Грайливий собака"
        )
        val chincilla: Animal = Animal(
            "Гризлі",
            "Гризлі величенька шиншила, яку прозвалі Гризлі, тому що він гучно гризе корм вночі.",
            "Спокійна шиншила"
        )



        binding.btnchinchilla.setOnClickListener()
        {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(KEY_Animalname, chincilla.name)
            intent.putExtra(KEY_Animaldesc, chincilla.desc)
            startActivity(intent)
        }
        binding.btncat.setOnClickListener()
        {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(KEY_Animalname, cat.name)
            intent.putExtra(KEY_Animaldesc, cat.desc)
            startActivity(intent)
        }
        binding.btndog.setOnClickListener()
        {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(KEY_Animalname, dog.name)
            intent.putExtra(KEY_Animaldesc, dog.desc)
            startActivity(intent)
        }
    }


    companion object {
        val KEY_Animalname = "key string"
        val KEY_Animaldesc = "animal desc"
    }

}

