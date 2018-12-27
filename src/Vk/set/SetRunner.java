package Vk.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

       Set<Car> sixCars = new HashSet<>();
       sixCars.add(new Car("BMW","X6",10000));
       sixCars.add(new Car("Audi","A8",8000));
       sixCars.add(new Car("Lada","15",2000));
       sixCars.add(new Car("Reno","Logan",3500));
       sixCars.add(new Car("Tesla","M6",20000));

       Set<Car> europaCars = new HashSet<>();
       sixCars.add(new Car("BMW","X6",10000));
       sixCars.add(new Car("Audi","A8",8000));
       sixCars.add(new Car("Pejo","150",4000));
       sixCars.add(new Car("Reno","Logan",3500));
       sixCars.add(new Car("Nissan","Kashkai",3800));

        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);

        SortedSet<Car> cars1 = uniqueCars.subSet(new Car("Mazda", "m2", 2500), new Car("Audi", "A8", 8000));
        print(cars1);

        print(uniqueCars);

        System.out.println("Higher");
        System.out.println(uniqueCars.higher(new Car("Pejo","150",4000)));
        System.out.println("Ceiling");
        System.out.println(uniqueCars.ceiling(new Car("Pejo","150",4002)));

    }
    private static void print(Set<Car> cars){
        System.out.printf("%-20s %-20s %-20s \n", "Car brand", "Model", "Price per day");
        for (Car car: cars) {
            System.out.printf("%-20s %-20s %-20s \n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
