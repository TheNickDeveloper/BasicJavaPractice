package com.basicjavapractice.animal;

public class Animal {
    private String name = "Animal";
    private String _favFood = "Food";

    public Animal(){}

    public Animal(String name, String faveFood){
        this.name = name;
        this._favFood = faveFood;
    }

    public final void changeName(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public String eatFood(){
        return "Eat " + this._favFood;
    }

    public String walk(){
        return this.name + " walk";
    }
}
