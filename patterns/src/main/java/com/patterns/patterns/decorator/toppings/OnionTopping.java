package com.patterns.patterns.decorator.toppings;

import com.patterns.patterns.decorator.Pizza;

public class OnionTopping extends Toppings{
    public Pizza pizza;

    public OnionTopping(Pizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return 6+ pizza.cost();
    }
}
