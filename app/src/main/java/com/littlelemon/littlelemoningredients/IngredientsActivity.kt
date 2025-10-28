package com.littlelemon.littlelemoningredients

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IngredientsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredients)

        // Enable back arrow in the Action Bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ingredients"

        // Read the dish name from the intent
        val dishName = intent.getStringExtra(EXTRA_DISH_NAME_KEY)

        // Choose ingredients based on the dish name
        val ingredients = when (dishName) {
            "Hamburger" -> "🍔 Hamburger Ingredients:\n\n- Minced Meat\n- Bun\n- Tomato\n- Lettuce\n- Cheese"
            "Pasta" -> "🍝 Pasta Ingredients:\n\n- Spaghetti\n- Tomato Sauce\n- Parmesan\n- Olive Oil\n- Basil"
            else -> "Unknown dish"
        }

        // Display the ingredients
        findViewById<TextView>(R.id.ingredients_list).text = ingredients
    }

    // Handle the back arrow in the action bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    companion object {
        private const val EXTRA_DISH_NAME_KEY = "DishName"

        fun start(context: Context, dishName: String) {
            val intent = Intent(context, IngredientsActivity::class.java).apply {
                putExtra(EXTRA_DISH_NAME_KEY, dishName)
            }
            context.startActivity(intent)
        }
    }
}
