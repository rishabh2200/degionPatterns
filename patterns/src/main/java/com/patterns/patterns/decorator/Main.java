package com.patterns.patterns.decorator;

import com.patterns.patterns.decorator.toppings.ExtraCheese;
import com.patterns.patterns.decorator.toppings.OnionTopping;

public class Main {

    public static void main(String args[] ){
        Pizza pizza = new ExtraCheese(new ExtraCheese(new OnionTopping(new Paneer())));
        System.out.println(pizza.cost());
    }
}
