package assessment;

import java.util.Scanner;

public class PatternPrint {

    public static void main(String[] args) {
        PatternPrint task = new PatternPrint();
        task.process();
    }

    private void process() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scan.nextLine();
        System.out.println("Enter number of rows");
        int row = scan.nextInt();
        printPattern(string, row);
        scan.close();
    }

    private void printPattern(String str, int row) {
        char[][] pattern = new char[row][str.length()];
        int index = 0, j = 0, i;
        while (index < str.length()) {
            for (i = 0; i < row & index < str.length(); i++) {
                pattern[i][j] = str.charAt(index++);
            }
            i--;
            j++;
            while (i > 1 & index < str.length()) {
                pattern[--i][j++] = str.charAt(index++);
            }
        }
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int columnIndex = 0; columnIndex < str.length(); columnIndex++) {
                if(pattern[rowIndex][columnIndex]== '\u0000'){
                    System.out.print(" ");
                }else
                    System.out.print(pattern[rowIndex][columnIndex]+" ");
            }
            System.out.println();
        }
    }
}