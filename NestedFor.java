package sep.seven;

import java.util.Scanner;
public class NestedFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a = sc.nextInt();
        int m = (a+1)/2;
        for(int i =1;i<=a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == j) {
                    if (i < m) {
                        System.out.print((a - i + 1));
                    } else {
                        System.out.print(i);
                    }
                } else if (i + j == a + 1) {
                    if(i<m){
                        System.out.print(i);
                    }
                    else{ System.out.print(j);}

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
