package AlexandreVaskovyi.inheritance;

public class Truck extends FuelAuto {

    private int corgoWeight;

    public Truck(String produser, String model, Engine engine, int availablePetrol, int tankValue, int corgoWeight) {
        super(produser, model, engine, availablePetrol, tankValue);
        this.corgoWeight = corgoWeight;
        System.out.println("Constructing truck");
    }

    @Override
    public void start(){
        isRunning = true;
        setCurrentSpeed(50);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop(){
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck has stopped");
    }

    public int getCorgoWeight() {
        return corgoWeight;
    }

    public void setCorgoWeight(int corgoWeight) {
        this.corgoWeight = corgoWeight;
    }

    public void load(){
        System.out.println("Cargo loaded");
    }

    public void unload(){
        System.out.println("Cargo unloaded");
    }

    @Override
    public void energize() {
        fuelUp(getTankValue() - getAvailablePetrol());
    }
}
