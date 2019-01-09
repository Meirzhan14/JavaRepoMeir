package Alishev.lesson34.lesson43;

public class Test {
    public static void main(String[] args) {
    ElectroCar electroCar = new ElectroCar(1);
    electroCar.start();

    ElectroCar.Battery battery = new ElectroCar.Battery();
    battery.sharge();

    }
}
