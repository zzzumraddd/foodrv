package com.example.oshqozon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oshqozon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: MutableList<Ovqat_data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = mutableListOf<Ovqat_data>()
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        list.add(Ovqat_data("Salad", "12450 recipes", R.drawable.burger))
        list.add(Ovqat_data("Burger", "12450 recipes", R.drawable.burger2))
        binding.rv.adapter = Ovqat_Adapter(this, list)

    }
}