package com.basicjavapractice.cars;

import com.basicjavapractice.cars.interfaces.ICar;

public class Honda implements ICar {
    private String carBrand = "Honda";

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int age() {
        return 10;
    }

    public String drive() {
        return getCarBrand() + " is running";
    }
}
