package com.patterns.patterns.chaindegion;

public class TwoTousand extends Atm{
    TwoTousand(int value,Atm nextNote){
        super(nextNote);
        this.value = value;
    }
}
