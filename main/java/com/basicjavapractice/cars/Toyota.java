package com.basicjavapractice.cars;

import com.basicjavapractice.cars.interfaces.ICar;

public class Toyota implements ICar {
    private String carBrand = "Toyota";

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int age() {
        return 5;
    }

    public String drive() {
        return getCarBrand() + " is running";
    }
}
