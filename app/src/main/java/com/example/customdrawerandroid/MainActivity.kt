package com.example.customdrawerandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)

        toolbar.setNavigationOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }
        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener { item ->
            val id = item.itemId
            drawerLayout.closeDrawer(GravityCompat.START)
            when (id) {
                R.id.nav_home -> Toast.makeText(
                    this@MainActivity,
                    "Home is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_message -> Toast.makeText(
                    this@MainActivity,
                    "Message is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.synch -> Toast.makeText(
                    this@MainActivity,
                    "Synch is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.trash -> Toast.makeText(
                    this@MainActivity,
                    "Trash is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.settings -> Toast.makeText(
                    this@MainActivity,
                    "Settings is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_login -> Toast.makeText(
                    this@MainActivity,
                    "Login is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_share -> Toast.makeText(
                    this@MainActivity,
                    "Share is clicked",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_rate -> Toast.makeText(
                    this@MainActivity,
                    "Rate us is Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                else -> return@OnNavigationItemSelectedListener true
            }
            true
        })


    }
}