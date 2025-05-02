package com.patterns.patterns.strategy;

import com.patterns.patterns.strategy.driveStrategy.SportDriveStrategy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        ArrayList<Vechile> vechiles = new ArrayList<>();

        vechiles.add(new NormalVechile());
        vechiles.add(new SportVechile());
        vechiles.add(new OffRoadVechile());

        vechiles.stream().forEach(e->{
            e.driveStrategy.drive();
        });
    }
}
