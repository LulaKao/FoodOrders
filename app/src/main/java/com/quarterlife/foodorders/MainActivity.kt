package com.quarterlife.foodorders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create order1
        val order1 = Order(1)
        order1.addItem(Noodles()) // add item
        order1.print() // print item

        // create order2
        val order2 = Order(2)
        order2.addItem(Noodles()) // add item
        order2.addItem(Vegetables()) // add item
        order2.print() // print item

        // create order3
        val order3 = Order(3)
        val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery")) // create list of items
        order3.addAll(items) // add all items
        order3.print() // print item
    }
}