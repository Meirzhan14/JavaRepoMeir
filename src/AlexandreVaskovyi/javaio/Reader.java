package AlexandreVaskovyi.javaio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public  void readFile(String fileName) throws IOException {
        BufferedReader reader =new BufferedReader(new FileReader(fileName));
        String c;
        while ((c = reader.readLine())!=null){
            System.out.println(c);
        }
    }

    public List<Student> readObject(String fileName){
        List<Student> students = new ArrayList<>();
        try(ObjectInputStream in = new ObjectOutputStream(Files.newInputStream(Paths.get(fileName)))){

            Object o = in.readObject();
            students.add()
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
