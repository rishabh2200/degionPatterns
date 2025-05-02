package com.patterns.patterns.strategy;

import com.patterns.patterns.strategy.driveStrategy.DriveStrategy;
import com.patterns.patterns.strategy.driveStrategy.NormalDriveStrategy;

public class NormalVechile extends Vechile{
    NormalVechile(){
        super(new NormalDriveStrategy());
    }



}
