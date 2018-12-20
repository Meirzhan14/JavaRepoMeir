package Vk.Vk_inheritance;

public abstract class FuelAuto extends Auto {
    private int availablePetrol;
    private int tankValue;

    public FuelAuto(String produser, String model, Engine engine, int availablePetrol, int tankValue) {
        super(produser, model, engine);
        this.availablePetrol = availablePetrol;
        this.tankValue = tankValue;
    }

    void fuelUp(int petrolVolume){
        availablePetrol+=petrolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankValue() {
        return tankValue;
    }

    public void setTankValue(int tankValue) {
        this.tankValue = tankValue;
    }
}
