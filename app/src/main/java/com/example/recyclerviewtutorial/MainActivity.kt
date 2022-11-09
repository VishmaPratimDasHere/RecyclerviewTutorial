package com.example.recyclerviewtutorial

import MyCustomAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialise data
        var data = mutableListOf<Person>()

        for (i in 1..100) {
            if (i%3==0){
                data.add(Person("Tricia",21))
//                Log.i("Add data","name: ${data[i].name}")
            } else if (i%2==0) {
                data.add(Person("Jessica",24))
//                Log.i("Add data","name: ${data[i].name}")
            } else {
                data.add(Person("Summer",22))
//                Log.i("Add data","name: ${data[i].name}")
            }
        }

        for (i in 1..data.lastIndex){
            Log.i("Check data", "name: ${data[i].name}")
        }


        //Step 1: Add recyclerview to gradle config: DONE
        //Step 2: Define data class : DONE
        //Step 3: Add recyclerview to activity : DONE
        //Step 4: Create custom row XML file to define what a row in recyclerview looks like: DONE
        //Step 5: Create Recyclerview adapter and Viewholder
        //Step 6: Bind the data to the view in the Viewholder in the recyclerview
        var rvApp=findViewById<RecyclerView>(R.id.rvContacts)
        rvApp.adapter=MyCustomAdapter(this,data)
        rvApp.layoutManager=LinearLayoutManager(this)
    }

    class Person(
        var name: String,
        var age: Int
    )

    fun createBirthday(view: View) {
        val intent= Intent(this,BirthdayGreetActivity::class.java)
        startActivity(intent)
    }
}