package com.quarterlife.foodorders

// subclass of Item
class Noodles : Item("Noodles", 10){
    override fun toString(): String{
        return name // return "Noodles"
    }
}