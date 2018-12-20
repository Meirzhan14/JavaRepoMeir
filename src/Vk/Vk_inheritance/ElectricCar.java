package Vk.Vk_inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(String produser, String model, int batteryVolume, int passengersNumber) {
        super(produser, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public void start(){
        isRunning = true;
        setCurrentSpeed(80);
        System.out.println("Car is starting");
    }

    @Override
    public void stop(){
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Car has stopped");
    }

    @Override
    public void energize() {
        charge();
    }

    public void charge(){
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
