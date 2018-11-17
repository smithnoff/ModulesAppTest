 package com.example.desenv.modulesapptest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*


 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        view.setOnClickListener {

        }
      Handler().postDelayed({
          startActivity(Intent(this,HomeActivity::class.java))
      },3000)
    }
}
