package november.seventeen;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        if(string.length()%2==0)
            System.out.println("Not possible");
        else diamond(string);
    }
    private void diamond(String s){
        int length = s.length();
        try {
            for (int i = 0; i < length; i++) {
                for (int j = length; j > i; j--)
                    System.out.print(" ");
                System.out.print(s.charAt(length - i - 1));
                for (int j = 1; j < (i - 1) * 2; j++)
                    System.out.print(" ");
                if (i == 1)
                    System.out.println();
                else System.out.print(s.charAt(length - i - 1) + "\n");
            }
            for (int i = length - 1; i >= 0; i--) {
                for (int j = length; j > i; j--)
                    System.out.print(" ");
                System.out.print(s.charAt(length - i));
                for (int j = 1; j < (i - 1) * 2; j++)
                    System.out.print(" ");
                if (i == 1) System.out.println();
                else System.out.print(s.charAt(length - i) + "\n");
            }
        }catch (StringIndexOutOfBoundsException e){}
    }
}