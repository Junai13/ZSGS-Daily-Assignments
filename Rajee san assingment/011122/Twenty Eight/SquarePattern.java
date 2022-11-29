package november.twentyeight;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        SquarePattern process = new SquarePattern();
        process.printPattern();
    }
    private void printPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();
        int i, j;
        for(i=row; i>=1; i--) {
            for(j= row; j>=1; j--)
                System.out.print(j>i ? j +" ":i +" ");
            for(j=2; j<=row; j++)
                System.out.print(j > i ? j +" ":i +" ");
            System.out.println();
        }
        for(i=2; i<=row; i++) {
            for(j=row; j>=1; j--)
                System.out.print(j>i ? j +" ":i +" ");
            for(j=2; j<=row; j++)
                System.out.print(j>i ? j +" ":i +" ");
            System.out.println();
        }
    }
}