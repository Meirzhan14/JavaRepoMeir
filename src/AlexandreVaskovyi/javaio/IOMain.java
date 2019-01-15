package AlexandreVaskovyi.javaio;

import AlexandreVaskovyi.treemap.AverageStudentGrade;
import AlexandreVaskovyi.treemap.SubjectGrade;
import AlexandreVaskovyi.treemap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class IOMain {
    private static final String FILE_NAME= "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";


    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        /*writer.writeFile(grades, FILE_NAME);
        reader.readFile(FILE_NAME);
        processGrades(grades, writer, BINARY_FILE);*/
        System.out.println(System.getProperty("user.dir"));
    }

    private static void processGrades (SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName){
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey:  grades.keySet()){
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(),grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }
}

