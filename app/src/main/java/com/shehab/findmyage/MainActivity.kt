package com.shehab.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {//extend AppCompatActivity : convert class to GUI class
    override fun onCreate(savedInstanceState: Bundle?) {//onCreate method in AppCompatActivity  : implement automatically when call AppCompatActivity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)// to Display content||R =>means resource "res"
      /**btnAge.setOnClickListener {
////            //button is clicked
////            val yearOfBirth:Int = editAge.text.toString().toInt()//yearOfBirth is object you must convert it to => "string" and convert to  => "Int"
////            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
////            val age = currentYear - yearOfBirth
////            txtResulst.text="your age is $age years"
       }*/

    }
//
    fun findAge(view:View){
    val yearOfBirth:Int = editAge.text.toString().toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val age = currentYear - yearOfBirth
    txtResulst.text="your age is $age years"
    }
}