package com.patterns.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
