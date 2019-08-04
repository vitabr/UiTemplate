package com.vito.uitemplate.view.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.vito.uitemplate.R
import com.vito.uitemplate.view.main.fragments.audio_settings.AudioSettingsFragment
import com.vito.uitemplate.view.main.fragments.main.MainFragment
import com.vito.uitemplate.view.main.fragments.more.MoreFragment

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_home)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_audio_settings -> {
                textMessage.setText(R.string.title_dashboard)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, AudioSettingsFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_more -> {
                textMessage.setText(R.string.title_notifications)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MoreFragment.newInstance())
                    .commitNow()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
