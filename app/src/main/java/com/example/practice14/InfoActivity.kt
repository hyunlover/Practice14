package com.example.practice14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val tv1 : TextView = findViewById(R.id.textView4)
        val tv2 : TextView = findViewById(R.id.textView5)
        val tv3 : TextView = findViewById(R.id.textView6)
        val arguments : Bundle? = intent.extras

        if (arguments!=null) {
            val mail : String? = arguments!!.getString("e-mail")
            val name : String = arguments!!.get("name").toString()
            val age : Int = arguments!!.getInt("age")

            tv1.text = "E-mail: $mail"
            tv2.text = "Name: $name"
            tv3.text = "Age: $age"
        }



    }
}