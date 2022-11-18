import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];
        int[][] matrixA = new int[y][x];



        for (int i = 0; i < x; i++) {

            for (int j = 0; j<y; j++) {
                System.out.print("Введите элемент matrix : [" + i + "][" + j + "]:");
                int sc1=scanner.nextInt();
                matrix[i][j] = sc1;
                matrixA[j][i]=sc1;

            //
            }
            System.out.println(""+Arrays.deepToString(matrix));

        }
        System.out.println(""+matrix.length);

      //
        scanner.close();

        for (int i = 0; i <y; i++) {

            for (int j = 0; j < x; j++) {

                System.out.print(matrixA[i][j]+"\t" );

            }

            System.out.println();

        }
        System.out.println("-----------------------");



        for (int i = 0; i <matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+"\t" );
            }
            System.out.println();




        }
        System.out.println(""+matrix.length);
    }
}