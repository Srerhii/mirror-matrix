import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
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

        //
        scanner.close();

        System.out.println("-----------------------");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("--------------------------------");
        for (int i = 0; i < matrix.length/2; i++) {
            int b[]=matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = b;
        }
            System.out.println();

        for (int i=0;i < matrix.length;i++){
            System.out.println();
            for (int j=0;j < matrix[i].length;j++)
                System.out.print(matrix[i][j]+"\t");




            }


    }

}