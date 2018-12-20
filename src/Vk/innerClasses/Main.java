package Vk.innerClasses;

public class Main {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("Xiaomi", "MI6");
        cellPhone.turnOn();
//      Display display = cellPhone.getDisplay();
        cellPhone.call("1234567890");
    }

}
