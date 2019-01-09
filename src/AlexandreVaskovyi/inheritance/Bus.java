package AlexandreVaskovyi.inheritance;

public class Bus extends FuelAuto {

    private int passengereNumber;

    public Bus(String produser, String model, Engine engine, int availablePetrol, int tankValue, int passengereNumber) {
        super(produser, model, engine, availablePetrol, tankValue);
        this.passengereNumber = passengereNumber;
        System.out.println("Bus is initialized");
    }

    public void fuelUp(){
        int volume = getTankValue() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if(volume>getTankValue()){
            setAvailablePetrol(getTankValue());
        }
        System.out.println("Adding Diesel");
    }

    public int getPassengereNumber() {
        return passengereNumber;
    }

    public void setPassengereNumber(int passengereNumber) {
        this.passengereNumber = passengereNumber;
    }

    public void pickUpPassengers(int passengereNum){
        this.passengereNumber += passengereNum;
        System.out.println("Picking up "+ passengereNum+ " passengers");
    }

    public void releasePassengers(int passengereNum){
        if(isRunning){
            stop();
        }
        passengereNumber = 0;
        System.out.println("Passengers released");
    }

    @Override
    public void start(){
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    public void stop(){
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    @Override
    public void energize() {
        fuelUp(getTankValue() - getAvailablePetrol());
    }
}

