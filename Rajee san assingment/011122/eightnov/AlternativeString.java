package eightnov;

import java.util.Scanner;

public class AlternativeString {
    public static void main(String[] args) {
        AlternativeString alternativeString = new AlternativeString();
        alternativeString.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        alternateChar(string);
    }
    private void alternateChar(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i + 1 < len && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if(count!=1)
                System.out.print(s.charAt(i) + "" + count + "");
            else
                System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
