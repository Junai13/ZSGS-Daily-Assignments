package november.twentyeight;

import java.util.Scanner;

public class DifferentCharacter {
    public static void main(String[] args) {
        DifferentCharacter task = new DifferentCharacter();
        task.getInput();
    }

    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String str2 = sc.nextLine();
        process(str1, str2);
        sc.close();
    }

    private void process(String str1, String str2) {
        String output = "";
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                output += (char) str1.charAt(i);
                output += (char) str2.charAt(i);
            }
        }
        System.out.println(output);
    }
}
