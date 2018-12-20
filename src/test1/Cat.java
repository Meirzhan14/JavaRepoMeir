package test1;

public class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }

    public void printDetails() {
        System.out.println(Run.getJumpHeight()); // DOES NOT COMPILE
    }
}