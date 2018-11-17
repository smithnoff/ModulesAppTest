 package com.example.desenv.modulesapptest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      Handler().postDelayed({
          startActivity(Intent(this,HomeActivity::class.java))
      },3000)
    }
}
