package AlexandreVaskovyi.javaio;

import AlexandreVaskovyi.treemap.AverageStudentGrade;
import AlexandreVaskovyi.treemap.SubjectGrade;
import AlexandreVaskovyi.treemap.TreeMapRunner;

import java.io.*;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {
    private static final String FILE_NAME= "GradeBook.txt";

    public static void main(String[] args) throws IOException {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        writeFile(grades);
        readFile();


    }

    private static void readFile() throws IOException {
        BufferedReader reader =new BufferedReader(new FileReader(FILE_NAME));
        String c;
        while ((c = reader.readLine())!=null){
            System.out.println(c);
        }
    }

    private static void writeFile(NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades) throws IOException {
        try(PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {

                writer.write("--------------------------------\n");
                writer.write("Student " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + "Grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }
}

