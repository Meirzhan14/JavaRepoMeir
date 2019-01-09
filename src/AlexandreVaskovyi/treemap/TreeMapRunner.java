package AlexandreVaskovyi.treemap;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrades();
        printGrades(grades, false);
        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade("", 80));
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudents = (NavigableMap<AverageStudentGrade, Set<SubjectGrade>>) grades.tailMap(border);
        System.out.println("-------------------------------------------");
        System.out.println("Scholarship students");
        printGrades(scholarshipStudents.descendingMap(),false);
        System.out.println("Contender student");
        AverageStudentGrade contender = grades.lowerKey(border);
        System.out.println(contender);
        System.out.println("Highest grade student");
        System.out.println(scholarshipStudents.descendingMap().firstEntry());
    }

    private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue){
        Set<AverageStudentGrade> averageGrades = grades.keySet();
        for (AverageStudentGrade gr : averageGrades){
            System.out.println(gr);
            if (printValue){
                System.out.println(grades.get(gr));
            }
        }
    }

    public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades() {
        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade("Math", 90));
        alexGrades.add(new SubjectGrade("Physics", 80));
        alexGrades.add(new SubjectGrade("History", 92));
        alexGrades.add(new SubjectGrade("Geography", 91));
        alexGrades.add(new SubjectGrade("Literature", 95));

        Set<SubjectGrade> jamesGrades = new HashSet<>();
        jamesGrades.add(new SubjectGrade("Math", 70));
        jamesGrades.add(new SubjectGrade("Physics", 60));
        jamesGrades.add(new SubjectGrade("History", 82));
        jamesGrades.add(new SubjectGrade("Geography", 91));
        jamesGrades.add(new SubjectGrade("Literature", 97));

        Set<SubjectGrade> mikeGrades = new HashSet<>();
        mikeGrades.add(new SubjectGrade("Math", 100));
        mikeGrades.add(new SubjectGrade("Physics", 90));
        mikeGrades.add(new SubjectGrade("History", 80));
        mikeGrades.add(new SubjectGrade("Geography", 85));
        mikeGrades.add(new SubjectGrade("Literature", 85));

        Set<SubjectGrade> aliGrades = new HashSet<>();
        aliGrades.add(new SubjectGrade("Math", 100));
        aliGrades.add(new SubjectGrade("Physics", 70));
        aliGrades.add(new SubjectGrade("History", 60));
        aliGrades.add(new SubjectGrade("Geography", 75));
        aliGrades.add(new SubjectGrade("Literature", 75));

        Set<SubjectGrade> ariGrades = new HashSet<>();
        ariGrades.add(new SubjectGrade("Math", 50));
        ariGrades.add(new SubjectGrade("Physics", 50));
        ariGrades.add(new SubjectGrade("History", 60));
        ariGrades.add(new SubjectGrade("Geography", 65));
        ariGrades.add(new SubjectGrade("Literature", 55));

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex", calcAverage(alexGrades)), alexGrades);
        map.put(new AverageStudentGrade("James", calcAverage(jamesGrades)), jamesGrades);
        map.put(new AverageStudentGrade("Mike", calcAverage(mikeGrades)), mikeGrades);
        map.put(new AverageStudentGrade("Ali", calcAverage(aliGrades)), aliGrades);
        map.put(new AverageStudentGrade("Ari", calcAverage(ariGrades)), ariGrades);

        return map;
    }

    private static float calcAverage(Set<SubjectGrade> grades){
        float sum=0f;
        for (SubjectGrade sg : grades){
            sum += sg.getGrade();
        }
        return sum/grades.size();
    }
}


