package AlexandreVaskovyi.javaio;

import AlexandreVaskovyi.treemap.AverageStudentGrade;
import AlexandreVaskovyi.treemap.SubjectGrade;
import AlexandreVaskovyi.treemap.TreeMapRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class IOMain {
    private static final String FILE_NAME= "GradeBook.txt";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();
        writer.writeFile(grades,FILE_NAME);
        reader.readFile(FILE_NAME);
    }

    private void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName){
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey: grades.keySet()){
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students,FILE_NAME);
    }
}

