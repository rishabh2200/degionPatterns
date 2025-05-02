package com.patterns.patterns.strategy;

import com.patterns.patterns.strategy.driveStrategy.DriveStrategy;

public class Vechile {
    public DriveStrategy driveStrategy;

    Vechile(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
}
