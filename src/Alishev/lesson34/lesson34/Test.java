package Alishev.lesson34.lesson34;

import Alishev.lesson34.lesson34.Animal;

interface AbleToEat{
    public void eat();
}
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);
        String a1 = "aa";
        String a2 = "aa";
        System.out.println(animal1.equals(animal2));
        System.out.println(a1 == a2);


    }

}
