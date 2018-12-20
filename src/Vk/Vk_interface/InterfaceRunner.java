package Vk.Vk_interface;

public class InterfaceRunner {
    public static void main(String[] args) {

        Priceable pizza = new Pizza("Margarita", 2, 30.2, Size.S);
        Priceable cellPhone = new CellPhone("Samsung", "Galaxy Alpha", 1, 200);
        Priceable fridge = new Fridge("LG", "Q22", 1, 1000);

        printDeliveryPrice(pizza);
        printDeliveryPrice(cellPhone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Priceable del){
        System.out.println("Delivery price " + del.calcDeliveryPrice());
        System.out.println("Order price "+ del.calcOrderPrice());
    }
}
