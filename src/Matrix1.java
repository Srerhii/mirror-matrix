import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];


        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                System.out.print("Введите элемент matrix : [" + i + "][" + j + "]:");
                int sc1 = scanner.nextInt();
                matrix[i][j] = sc1;


            }
            System.out.println("" + Arrays.deepToString(matrix));

        }
        scanner.close();
        System.out.println("-----------------------");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("---------------------");

        int v = 0;
        double a = (double) matrix.length / 2;
        double b = Math.ceil(a);
        System.out.println("b=  " + b);
        int maxY = 0;
        double maxX = b;


        for (int i = 0; i < maxX; i++) {
            if (x % 2 == 0) {
                maxY = y;
            }
            if (x % 2 != 0) {
                maxY=y;
            }

            for (int j = 0; j < maxY; j++) {
                v = matrix[i][j];

                int ax = matrix.length - i - 1;
                int ay = maxY - j - 1;

                matrix[i][j] = matrix[ax][ay];
                matrix[ax][ay] = v;

            }

        }
        System.out.println("==================");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("" + Arrays.deepToString(matrix));
    }
}
// Перебор мартрици с конца(задом на перед)
//for (int i = matrix.length - 1; i >= 0; i--) {
//        for (int j = matrix[i].length - 1; j >= 0; j--) {
//        System.out.print(matrix[i][j] + "\t");
//        }
//        System.out.println();
//        }