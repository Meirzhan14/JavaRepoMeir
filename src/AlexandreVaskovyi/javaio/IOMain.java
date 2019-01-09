package AlexandreVaskovyi.javaio;

import AlexandreVaskovyi.treemap.AverageStudentGrade;
import AlexandreVaskovyi.treemap.SubjectGrade;
import AlexandreVaskovyi.treemap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("GradeBook.txt");

            for (AverageStudentGrade gradeKey : grades.keySet()) {

                fileWriter.write("----------");
                fileWriter.write("Student " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    fileWriter.write("Subject: " + grade.getSubject() + "Grade: " + grade.getGrade() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

