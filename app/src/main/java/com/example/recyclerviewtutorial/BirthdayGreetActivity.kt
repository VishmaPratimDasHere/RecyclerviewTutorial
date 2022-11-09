package com.example.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name=intent.getStringExtra("name")
        findViewById<TextView>(R.id.tvGreet).text="Happy Birthday !"
    }
}