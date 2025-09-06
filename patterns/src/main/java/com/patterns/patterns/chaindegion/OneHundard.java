package com.patterns.patterns.chaindegion;

public class OneHundard extends Atm{
    OneHundard(int value, Atm nextNote){
        super(nextNote);
        this.value = value;
    }
}
