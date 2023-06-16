package com.aditya.nonaccessspecifiers.memoryComparison;

public class StaticHumanBeing {
    private static String planetName;
    private static String personName;

    public static String getPlanetName() {
        return planetName;
    }

    public static void setPlanetName(String planetName) {
        StaticHumanBeing.planetName = planetName;
    }

    public static String getPersonName() {
        return personName;
    }

    public static void setPersonName(String personName) {
        StaticHumanBeing.personName = personName;
    }
}
