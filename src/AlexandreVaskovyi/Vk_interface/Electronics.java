package AlexandreVaskovyi.Vk_interface;

public abstract class Electronics implements Priceable {
    private String make;
    private String model;
    private int quality;
    private int price;

    public Electronics(String make, String model, int quality, int price) {
        this.make = make;
        this.model = model;
        this.quality = quality;
        this.price = price;
    }

    @Override
    public int calcOrderPrice() {
        return getQuality() * getPrice();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getQuality() {
        return quality;
    }

    public int getPrice() {
        return price;
    }
}
