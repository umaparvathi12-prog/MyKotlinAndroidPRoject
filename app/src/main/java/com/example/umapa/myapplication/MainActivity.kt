package com.example.umapa.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

   val foodList = arrayListOf("Chinese","Hamburger","Pizza","Mc Donalds","Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedfoodtxt.text = foodList[randomFood]
        }
        buttonaddfood.setOnClickListener{
            val newfood = addnewfood.text.toString()
            foodList.add(newfood)
            addnewfood.text.clear()

        }

    }
}
