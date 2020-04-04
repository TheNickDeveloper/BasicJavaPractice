package com.basicjavapractice.animal;

public class Dog extends Animal {
    public String favToy = "ball";

    public Dog(){}

    public Dog(String name, String favFood, String favToy){
        super(name,favFood);
        this.favToy = favToy;
    }
    public void setFavToy(String favToy){
        this.favToy = favToy;
    }
    public String getFavToy(){
        return this.favToy;
    }

    @Override
    public String walk(){
        return this.getName() + " doing cat walk";
    }
}
