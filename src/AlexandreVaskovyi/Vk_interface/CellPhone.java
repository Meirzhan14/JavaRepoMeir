package AlexandreVaskovyi.Vk_interface;

public class CellPhone extends Electronics {

    public CellPhone(String make, String model, int quality, int price) {
        super(make, model, quality, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if(getPrice()>= 300) {
            return 0;
        }
          else {
              return 10;
            }
        }

}

