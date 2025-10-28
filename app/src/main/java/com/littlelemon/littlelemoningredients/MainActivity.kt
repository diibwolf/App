package com.littlelemon.littlelemoningredients

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Start IngredientsActivity with the dish name when buttons are clicked
        findViewById<View>(R.id.main_dish_1).setOnClickListener {
            IngredientsActivity.start(this, "Hamburger")
        }

        findViewById<View>(R.id.main_dish_2).setOnClickListener {
            IngredientsActivity.start(this, "Pasta")
        }
    }
}
