package AlexandreVaskovyi.javaio;

import AlexandreVaskovyi.treemap.AverageStudentGrade;
import AlexandreVaskovyi.treemap.SubjectGrade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class Writer {
    public  void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {

                writer.write("--------------------------------\n");
                writer.write("Student " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + "Grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }

    public void writeObject(List<Student> students, String fileName){}
}
