package com.basicjavapractice.cars.interfaces;

public abstract class  Flyable {
    boolean canFly = true;

    public boolean crash(){
        return canFly = false;
    }

    public abstract void setCarWingsNumber(int carWingsNumber);
    public abstract int getCarWingsNumber();
}
