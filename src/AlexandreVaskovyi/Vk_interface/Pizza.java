package AlexandreVaskovyi.Vk_interface;

public class Pizza implements Priceable{
    private String name;
    private int quantity;
    private double price;
    private Size size;

    public Pizza(String name, int quantity, double price, Size size) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
    }

    @Override
    public int calcDeliveryPrice() {
        if (quantity > 2 || size == Size.XL)
            return 0;
        else {
            return 7;
        }
    }

    @Override
    public int calcOrderPrice() {
        return (int) (quantity * price);
    }



    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}
