package com.basicjavapractice;

import com.basicjavapractice.animal.Animal;
import com.basicjavapractice.animal.Dog;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void shouldReturnAnimalName(){
        var animal = new Animal();
        //animal.changeName("KKK");
        Assert.assertEquals("Animal", animal.getName());
    }

    @Test
    public void shouldReturnDogName(){
        Animal dog = new Dog("Dog","meat","stick");
        Assert.assertEquals("Dog", dog.getName());
    }

    @Test
    public void shouldReturnAnimalWalk(){
        Animal animal = new Animal();
        var expected = "Animal walk";
        Assert.assertEquals(expected, animal.walk());
    }

    @Test
    public void shouldReturnDogWalk(){
        Animal dog = new Dog("Dog","meat","stick");
        var expected = "Dog doing cat walk";
        Assert.assertEquals(expected, dog.walk());
    }

    @Test
    public void shouldReturnDogFavToy(){
        Animal dog = new Dog();
        Assert.assertEquals("ball",((Dog)dog).favToy);
    }
}
