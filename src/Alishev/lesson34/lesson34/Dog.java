package Alishev.lesson34.lesson34;

import Alishev.lesson34.lesson34.Animal;

public class Dog extends Animal {
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void makeSound(){
        System.out.println("bark");
    }
}
