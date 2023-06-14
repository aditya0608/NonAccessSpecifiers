package com.aditya.nonaccessspecifiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NonAccessSpecifiersApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NonAccessSpecifiersApplication.class, args);


        HousingSociety housingSociety = new HousingSociety(100,"Forest Trails");
        housingSociety.buildMaintenanceDepartment(10);
        WaterTank waterTank=housingSociety.getWaterMaintenanceDepartment().waterTanks.get(1);
        Water water=waterTank.getWater();
        WaterTank.Operation.emptyTank(water);
        WaterTank.Operation.fillWater(water,waterTank);
    }
}
