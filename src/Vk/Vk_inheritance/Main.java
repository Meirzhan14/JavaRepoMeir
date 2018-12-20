package Vk.Vk_inheritance;

public class Main {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 500);
        Engine busEngine = new Engine(3.0, EngineType.PETROL, 200);
        Auto truck = new Truck("Zil", "K170", truckEngine, 300, 500, 1000);
        Auto electricCar = new ElectricCar("Tesla", "model S", 10, 5);
        Auto bus = new Bus("Mercedez", "Sprinter", busEngine, 30, 50, 12);
//        Auto auto = new Auto("WV", "Polo", busEngine);

        bus.start();
        bus.stop();
        electricCar.start();
        electricCar.stop();
        runCar(bus);
        runCar(truck);
        runCar(electricCar);
//        runCar(auto);
    }

    private static void runCar(Auto auto){
        auto.start();
        auto.stop();
        auto.energize();
//        if(auto instanceof FuelAuto){
//            FuelAuto fuelAuto = (FuelAuto) auto;
//            fuelAuto.fuelUp(20);
//        }
    }
}
