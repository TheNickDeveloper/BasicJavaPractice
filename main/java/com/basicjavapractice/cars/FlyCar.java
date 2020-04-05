package com.basicjavapractice.cars;

import com.basicjavapractice.cars.interfaces.Flyable;
import com.basicjavapractice.cars.interfaces.ICar;

public class FlyCar extends Flyable implements ICar {
    private int carWingsNumber;
    private String carBrand;

    public FlyCar(String carBrand, int carWingsNumber){
        this.carBrand = carBrand;
        this.carWingsNumber = carWingsNumber;
    }

    @Override
    public void setCarWingsNumber(int carWingsNumber) {
        this.carWingsNumber = carWingsNumber;
    }

    @Override
    public int getCarWingsNumber() {
        return this.carWingsNumber;
    }

    public String getCarBrand() {
        return "CanFlyCar";
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int age() {
        return 110;
    }

    public String drive() {
        return "Fly";
    }
}
