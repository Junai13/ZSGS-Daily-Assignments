package elevennov;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size in array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements os the array: ");
        int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++)
                matrix[i][j] = sc.nextInt();
        }
        rotation(matrix,size);
    }
    private void rotation(int[][] matrix,int size) {
        System.out.println("Matrix before rotate: " );
       // System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            int first = 0;
            int last = size - 1;
            while (first < last) {
                int temp = matrix[first][i];
                matrix[first][i] = matrix[last][i];
                matrix[last][i] = temp;
                first++;
                last--;
            }
        }
        System.out.println("Matrix after rotate: ");
        //System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
