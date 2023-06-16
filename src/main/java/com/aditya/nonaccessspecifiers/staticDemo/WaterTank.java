package com.aditya.nonaccessspecifiers.staticDemo;

import java.util.Arrays;

public class WaterTank {
    private Water water;
    private Integer capacity;
    Arrays arrays;
    public WaterTank(Water water,Integer capacity)
    {
        this.water=water;
        this.capacity=capacity;
    }
    static class Operation
    {
        public  static void fillWater(Water water,WaterTank waterTank) throws InterruptedException {
            System.out.println("Water is getting supplied....");
            while(water.getWaterLevel()<=waterTank.capacity)
            {
                System.out.println("Water level in tank is "+water.getWaterLevel()+" L");
                water.setWaterLevel(water.getWaterLevel()+1);
                Thread.sleep(2000);
            }
            System.out.println("The tank is now full ....");
        }
        public static  void ringAlarm(Water water) throws InterruptedException {
            System.out.println("Water is full please close the supply.....");
            emptyTank(water);
        }

        public static  void emptyTank(Water water) throws InterruptedException {
            System.out.println("The tank is getting empty...");
            while(water.getWaterLevel()>0)
            {
                System.out.println("Water level in tank is "+water.getWaterLevel()+" L");
                water.setWaterLevel(water.getWaterLevel()-1);
                Thread.sleep(2000);
            }
            System.out.println("The tank is now empty......");
        }

    }

    public  Water getWater() {
        return water;
    }

    public  void setWater(Water water) {
        this.water = water;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
