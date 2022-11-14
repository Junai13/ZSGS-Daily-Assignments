package fourteennov;

import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        BeautifulString beautifulString = new BeautifulString();
        beautifulString.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked: ");
        String string = sc.nextLine();
        System.out.println(string +" is a  " +funnyString(string));
    }
    private String funnyString(String s) {
        int len =s.length();
        for(int i=0;i<len-1;i++)
        {
            if((int)Math.abs(s.charAt(i)-s.charAt(i+1))!=
                    (int)Math.abs(s.charAt(len-1-i)-s.charAt(len-2-i)))
                return "Not beatiful string";
        }
        return "Beautiful string";
    }


}
