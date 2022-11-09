package ninenov;

import java.util.Scanner;

public class SpiralPriting {
    public static void main(String[] args) {
        SpiralPriting spiral = new SpiralPriting();
        spiral.getInput();
    }
    private  void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row of the array");
        int row = sc.nextInt();
        System.out.println("Enter the coloum of the matrix: ");
        int column = sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        int[][] arr = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printPattern(arr,row,column);
    }
    private void printPattern(int[][] arr,int row,int col){
        int i,k=0,l=0;
        while (k<row && l<col){
            for(i=l;i<col;i++)
                System.out.print(arr[k][i]+" ");
            k++;
            for(i=k;i<row;++i)
                System.out.print(arr[i][col-1]+" ");
            col--;
            if(k<row){
                for(i=col-1;i>=l;--i)
                    System.out.print(arr[row-1][i]+" ");
                row--;
            }
            if(l<col){
                for(i=row-1;i>=k;--i)
                    System.out.print(arr[i][l]+" ");
                l++;
            }
        }
    }
}
