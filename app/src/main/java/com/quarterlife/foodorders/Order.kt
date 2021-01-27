package com.quarterlife.foodorders

class Order(private val orderNumber: Int){
    private val itemList = mutableListOf<Item>()

    // add item in itemList
    fun addItem(newItem: Item){
        itemList.add(newItem)
    }

    // add all items in itemList
    fun addAll(newItems: List<Item>){
        itemList.addAll(newItems)
    }

    // print the order
    fun print(){
        println("Order #$orderNumber")
        var total = 0
        for(item in itemList){
            println("$item: $${item.price}")
            total += item.price
        }
        println("Total: $$total")
        println("------------------------")
    }
}