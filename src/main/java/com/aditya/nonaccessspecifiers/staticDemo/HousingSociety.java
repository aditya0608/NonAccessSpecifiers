package com.aditya.nonaccessspecifiers.staticDemo;

import java.util.ArrayList;
import java.util.List;

public class HousingSociety {

    private List<Apartment> apartments;
    private String societyName;
    private WaterMaintenanceDepartment waterMaintenanceDepartment;

    public HousingSociety(Integer numberOfFlats,String societyName)
    {
        int flatCount=0;
        apartments=new ArrayList<>();
        while(flatCount++<numberOfFlats)
        {
            apartments.add(new Apartment());
        }
        System.out.println("The society "+societyName+" is constructed with "+numberOfFlats+" apartments ... ");
    }
    public void buildMaintenanceDepartment(Integer numberOfWaterTanks)
    {
        waterMaintenanceDepartment=new WaterMaintenanceDepartment(numberOfWaterTanks);
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public String getName() {
        return societyName;
    }

    public void setName(String societyName) {
        this.societyName = societyName;
    }

    public WaterMaintenanceDepartment getWaterMaintenanceDepartment() {
        return waterMaintenanceDepartment;
    }

    public void setWaterMaintenanceDepartment(WaterMaintenanceDepartment waterMaintenanceDepartment) {
        this.waterMaintenanceDepartment = waterMaintenanceDepartment;
    }
}
