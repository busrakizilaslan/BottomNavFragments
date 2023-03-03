package com.example.bottomnavfragments

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavfragments.databinding.ActivityApplicationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ApplicationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApplicationBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id)
        if (navHostFragment != null) {
            navController = navHostFragment.findNavController()
        }
        setupWithNavController(binding.bottomNav,navController)

    }
}