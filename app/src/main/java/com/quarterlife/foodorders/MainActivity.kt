package com.quarterlife.foodorders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create orderList
        val orderList = mutableListOf<Order>()

        // create order1
        val order1 = Order(1)
        order1.addItem(Noodles()) // add item
        orderList.add(order1) // add order1 in orderList

        // create order2
        val order2 = Order(2)
        order2.addItem(Noodles()) // add item
        order2.addItem(Vegetables()) // add item
        orderList.add(order2) // add order2 in orderList

        // create order3
        val order3 = Order(3)
        val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery")) // create list of items
        order3.addAll(items) // add all items
        orderList.add(order3) // add order3 in orderList

        // print each order in orderList
        for(order in orderList){
            order.print()
        }
    }
}