package com.aditya.nonaccessspecifiers;

public class Water {

    private static String pHLevel;
    private static String colour;
    private Integer waterLevel;

    public static String getpHLevel() {
        return pHLevel;
    }

    public static void setpHLevel(String pHLevel) {
        Water.pHLevel = pHLevel;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Water.colour = colour;
    }

    public Integer getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(Integer waterLevel) {
        this.waterLevel = waterLevel;
    }
}
