package com.patterns.patterns.strategy;

import com.patterns.patterns.strategy.driveStrategy.SportDriveStrategy;

public class OffRoadVechile extends Vechile {
 OffRoadVechile(){
     super(new SportDriveStrategy());
 }
}
