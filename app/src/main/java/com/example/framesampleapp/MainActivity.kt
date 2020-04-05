package com.example.framesampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentOne = FirstFragment()
        val fragmentTwo = SecondFragment()
// another two comment for git test
        val someData = Bundle()
        someData.putString("key", "value")
       // someData.putInt("intKey", 45)
        fragmentOne.arguments = someData

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, FirstFragment())
            .commit()
//        supreme.setOnClickListener{
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainer, FirstFragment())
//                .commit()
//        }
//        newBalance.setOnClickListener{
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainer, SecondFragment())
//                .commit()
//        }



    }


}
