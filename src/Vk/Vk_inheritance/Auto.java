package Vk.Vk_inheritance;

public abstract class Auto {

    private String produser = "BMW";
    private String model = "100";
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;


    public Auto(String produser, String model, Engine engine) {
        this.produser = produser;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto is initialized");
    }

    public abstract void energize();

    public void start(){
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop(){
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour){
        currentSpeed+= kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kmPerHour");
    }

    public Engine getEngine() {
        return engine;
    }

    public String getProduser() {
        return produser;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngineType() {
        return engine;
    }

    public int getCuurentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
