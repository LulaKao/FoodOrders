package com.quarterlife.foodorders

// subclass of Item
class Vegetables(private vararg val toppings : String) : Item("Vegetables", 5){
    override fun toString(): String{
        return if(toppings.isEmpty()){
            "$name Chef's Choice" // return "Vegetables Chef's Choice"
        } else {
            name + " " + toppings.joinToString() // return "Vegetables AAA, BBB, CCC..."
        }
    }
}