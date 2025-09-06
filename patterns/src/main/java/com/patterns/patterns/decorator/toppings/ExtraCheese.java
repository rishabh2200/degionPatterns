package com.patterns.patterns.decorator.toppings;

import com.patterns.patterns.decorator.Pizza;

public class ExtraCheese extends Toppings{

    public Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return 5+pizza.cost();
    }
}
