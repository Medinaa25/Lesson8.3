package com.example.lesson83

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson83.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import android.view.MenuItem as MenuItem1

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragment: Fragment
    private val mainFragment= MainFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


            /* binding.buttonNavigation.setOnItemSelectedListener { item ->
            ()-> Unit{
            when (item.itemId) {
                R.id.characters_item -> {
                    navigate(mainFragment)
                }

                R.id.location_item -> {
                    navigate(secondFragment)
                }

            }
        }*/

        }



}