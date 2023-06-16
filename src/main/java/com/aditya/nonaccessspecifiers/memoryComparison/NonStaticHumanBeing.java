package com.aditya.nonaccessspecifiers.memoryComparison;

public class NonStaticHumanBeing {
    private  String planetName;
    private static String personName;

    public  String getPlanetName() {
        return planetName;
    }

    public  void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public static String getPersonName() {
        return personName;
    }

    public static void setPersonName(String personName) {
        NonStaticHumanBeing.personName = personName;
    }
}
