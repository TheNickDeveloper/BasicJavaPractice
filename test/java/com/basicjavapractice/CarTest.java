package com.basicjavapractice;

import com.basicjavapractice.cars.FlyCar;
import com.basicjavapractice.cars.Honda;
import com.basicjavapractice.cars.Toyota;
import com.basicjavapractice.cars.interfaces.ICar;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

public class CarTest {

    private ICar[] cars = {new Toyota(), new Honda()};
    private ICar flyCar = new FlyCar("FlyCar", 2);

    @Test
    public void shouldReturnCarBrand(){
        var carBrands = new StringJoiner(",");
        for (var car: cars) {
            carBrands.add(car.getCarBrand());
        }

        Assert.assertEquals("Toyota,Honda",carBrands.toString());
    }

    @Test
    public void shouldReturnAge(){
        var carsAge = new StringJoiner(",");
        for (var car: cars) {
            carsAge.add(String.valueOf(car.age()));
        }

        Assert.assertEquals("5,10",carsAge.toString());
    }

    @Test
    public void shouldReturnRun(){
        var carsAction = new StringJoiner(",");
        for (var car: cars) {
            carsAction.add(car.drive());
        }

        Assert.assertEquals("Toyota is running,Honda is running",carsAction.toString());
    }

    @Test
    public void shouldReturnIfCanFly(){
        boolean ifCanFly = ((FlyCar)flyCar).crash();
        Assert.assertEquals(false, ifCanFly);
    }

    @Test
    public void shouldReturnFlyCarWingNumber(){
        var newFlyCar = ((FlyCar) flyCar);
        newFlyCar.setCarWingsNumber(4);
        Assert.assertEquals(4, newFlyCar.getCarWingsNumber());
    }
}
