package AlexandreVaskovyi.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 100; i++) {
            ++frequency[1+random.nextInt(6)];
        }

        for (int i: frequency) {
            System.out.println("Side "+ i);
        }
        //multidimArrayLauncher();
    }

    private static void multidimArrayLauncher(){
        int[][] a = {{1,2},
                     {3,4,5,6},
                     {1}};
        int[][] b = new int[2][];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ "");
            }
            System.out.println();
        }
    }
}
