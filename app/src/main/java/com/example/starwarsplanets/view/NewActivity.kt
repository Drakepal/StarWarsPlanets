package com.example.starwarsplanets.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starwarsplanets.R
import com.example.starwarsplanets.databinding.ActivityNewBinding
import com.example.starwarsplanets.viewmodel.getProgressDrawable
import com.example.starwarsplanets.viewmodel.loadImage

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val planetIntent = intent
        val planetNameNew = planetIntent.getStringExtra("planetName")
        val planetTypeNew = planetIntent.getStringExtra("planetType")
        val planetDescriptionNew = planetIntent.getStringExtra("planetDescription")
        val planetImageNew = planetIntent.getStringExtra("planetImage")

        binding.planetName.text = planetNameNew
        binding.planetType.text = planetTypeNew
        binding.planetDescription.text = planetDescriptionNew
        binding.planetImageDetail.loadImage(planetImageNew, getProgressDrawable(this))
    }
}