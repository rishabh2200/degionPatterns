package com.patterns.patterns.factory;

public class ShapeFactory {
    public static Shape getShape(String shape){
        switch(shape){
            case "CIRCLE":
                return new CircleShape();
            case "RECTANGLE":
                return new RectangleShape();
            default:
                return null;
        }
    }
}
