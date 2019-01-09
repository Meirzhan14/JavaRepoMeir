package AlexandreVaskovyi.Vk_interface;

public class Fridge extends Electronics {

    public Fridge(String make, String model, int quality, int price) {
        super(make, model, quality, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice()>= 300) {
            return 0;
        }
        else {
            return 30;
        }
    }


}

