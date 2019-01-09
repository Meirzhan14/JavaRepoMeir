package AlexandreVaskovyi.Vk_interface;

public interface Priceable extends Deliverable, Orderable{
    default int calcPrice(){
        return calcOrderPrice() + calcDeliveryPrice();
    }


}
