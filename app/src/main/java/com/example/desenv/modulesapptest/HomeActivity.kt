package com.example.desenv.modulesapptest

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                supportFragmentManager.beginTransaction().replace(fragment_container.id,MyWallFragment()).commitNow()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {


                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {


                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().replace(fragment_container.id,MyWallFragment()).commitNow()
    }
}
