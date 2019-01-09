package Alishev.lesson34.lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
    Person person = new Person(1,"Bob");
    Person person1 = new Person(2, "Zunga");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(person);
            objectOutputStream.writeObject(person1);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
