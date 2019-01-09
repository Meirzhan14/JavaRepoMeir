package AlexandreVaskovyi.arrays;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradeArray = {
                {87,96,69},
                {68,56,20},
                {45,12,5}
        };
        System.out.println("Min "+calcMin(gradeArray));
        varArgs();
        processArrays();

    }
    private static int calcMin(int[][] grades){
      int min = 100;
        for (int[] row: grades) {
            for (int i:  row) {
                if(min>i){
                    min = i;
                }
            }
        }
        return min;

    }


    private static void varArgs(){
        double a = 0.56;
        double b = 1.90;
        double c = 3.90;
        double d = 80.91;

        System.out.println("Avarege of 2 elements is " + calcAverage(a,b));
        System.out.println("Avarege of 3 elements is " + calcAverage(a,b,c));
        System.out.println("Avarege of 4 elements is " + calcAverage(a,b,c,d));


    }

    private static double calcAverage(double...args){
        double sum = 0;
        for(double i: args){
             sum = sum+i;
        }
        return sum/args.length;
        }

    private static void processArrays(){
        double[] doubleArray = {8.9, 3.2, 2.22, 8.12,45.0};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray,7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1,2,3,4,5,6};
        int[] copyArray = new int[10];

        System.arraycopy(intArray, 0, copyArray, 0, intArray.length);
        System.out.println(Arrays.toString(copyArray));
    }
}




