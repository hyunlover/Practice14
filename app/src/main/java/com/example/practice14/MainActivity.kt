package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun ButtonClick(view: View){
        val intent : Intent = Intent(this@MainActivity, InfoActivity::class.java)
        val mailText : TextView = findViewById(R.id.editTextTextEmailAddress)
        val nameText : TextView = findViewById(R.id.editTextText)
        val ageText : TextView = findViewById(R.id.editTextNumber)

        val mail = mailText.text.toString()
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()

        intent.putExtra("name", name)
        intent.putExtra("e-mail", mail)
        intent.putExtra("age", age)

        when (view.id)
        {
           R.id.button -> startActivity(intent)
        }
    }



}