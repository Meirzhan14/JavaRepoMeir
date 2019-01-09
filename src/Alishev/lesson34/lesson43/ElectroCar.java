package Alishev.lesson34.lesson43;

public class ElectroCar {
    private int id;

    // вложенный нестатисеский класс
    private  class Motor{
        public void startMotor(){
            System.out.println("Motor " + id +" is starting");
        }
    }
    // статичский вложенный класс
    public static class Battery{
        public void sharge(){
            System.out.println("Battery is charging" );
        }
    }

    public ElectroCar(int id){
        this.id = id;
    }
    public  void start(){
        Motor motor = new Motor();
        motor.startMotor();

        class SomeClass{
            public void someMethod(){
                final int x = 1;
                System.out.println(id);
                System.out.println(x);
            }
        }

        System.out.println("Electrocar "+ id + "is starting");
    }
}
