package com.patterns.patterns.strategy;

import com.patterns.patterns.strategy.driveStrategy.SportDriveStrategy;

public class SportVechile extends Vechile{
    SportVechile(){
        super(new SportDriveStrategy());
    }
}
