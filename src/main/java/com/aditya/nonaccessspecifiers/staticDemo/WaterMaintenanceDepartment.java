package com.aditya.nonaccessspecifiers.staticDemo;

import java.util.ArrayList;
import java.util.List;

public class WaterMaintenanceDepartment {

    List<WaterTank> waterTanks;

    public WaterMaintenanceDepartment(Integer numberOfWaterTanks) {
        int waterTankCount = 0;
        waterTanks = new ArrayList<>();
        Water water = new Water();
        water.setpHLevel("7");
        water.setColour("Colourless");
        while (waterTankCount++ < numberOfWaterTanks) {
            WaterTank waterTank = new WaterTank(water, 10);
            waterTank.setWater(water);
            waterTank.getWater().setWaterLevel(waterTank.getCapacity());
            waterTanks.add(waterTank);
        }
        System.out.println("Water maintenance department has been set up with " + numberOfWaterTanks + " Water tanks");
    }

}
