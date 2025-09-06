package com.patterns.patterns.chaindegion;

abstract class Atm {
    public int value;

    public Atm nextNote;

    Atm(Atm nextNote){
        this.nextNote = nextNote;
    }


    public void compute(int currency){

            if(value<=currency){
                System.out.println("Number of note "+value+" is = "+currency/value);
                currency = currency%value;
            }
            if(currency>0){
                nextNote.compute(currency);

        }
    }
}
