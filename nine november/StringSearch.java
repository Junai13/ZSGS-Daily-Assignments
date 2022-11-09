package ninenov;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSearch {
    public static void main(String[] args) {
        StringSearch search = new StringSearch();
        search.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the column of the matrix: ");
        int col = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr[i][j] = sc.next().charAt(0);
        }
        sc.nextLine();
        System.out.println("Enter the word to be search: ");
        String word = sc.nextLine();
        findWord(arr,word);
    }
    private void findWord(char[][] matrix, String word) {
        String result;
        Set<String> results = new LinkedHashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == word.charAt(0)) {
                    result = word.charAt(0) + "(" + i + "," + j + ") ";
                    findNextLetter(matrix, i, j, word, 1, result, results);
                }
            }
        }
        for (String str : results) {
            System.out.println(str);
        }

    }

    private void findNextLetter(char[][] matrix, int startRow, int startColumn,
                                String word, int index, String result, Set<String> set) {
        if (index == word.length()) {
            set.add(result);
            return;
        }
        int[][] positions = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
        int row, column;
        String newResult;
        for (int k = 0; k < 8; k++) {
            row = startRow + positions[k][0];
            column = startColumn + positions[k][1];
            if (row < 0) {
                row = matrix.length - 1;
                column = startColumn;
            } else if (row == matrix.length) {
                row = 0;
                column = startColumn;
            } else if (column < 0) {
                row = startRow;
                column = matrix[0].length - 1;
            } else if (column == matrix[0].length) {
                row = startRow;
                column = 0;
            }
            if (matrix[row][column] == word.charAt(index)) {
                newResult = result + word.charAt(index) + "(" + row + "," + column + ") ";
                findNextLetter(matrix, row, column, word, index + 1, newResult, set);
            }
        }
    }
}