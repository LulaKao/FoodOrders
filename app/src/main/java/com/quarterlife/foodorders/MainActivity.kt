package com.quarterlife.foodorders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create orderList
        val orderList = mutableListOf<Order>()

        // create order1 and add it to orderList
        orderList.add(Order(1)
                .addItem(Noodles()))

        // create order2 and add it to orderList
        orderList.add(Order(2)
                .addAll(listOf(Noodles(),Vegetables())))

        // create order3 and add it to orderList
        orderList.add(Order(3)
                .addAll(listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))))

        // create order4 and add it to orderList
        orderList.add(Order(4)
                .addAll(listOf(Noodles(),Vegetables("Cabbage","Onion"))))

        // print each order in orderList
        for(order in orderList){
            order.print()
        }
    }
}