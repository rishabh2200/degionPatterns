package com.patterns.patterns.chaindegion;

public class Main {
    public static void main(String[] args) {
        OneHundard oneHundard = new OneHundard(100,null);
        TwoTousand twoTousand = new TwoTousand(2000,oneHundard);

        twoTousand.compute(2200);
    }
}
