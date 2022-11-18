package november.seventeen;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        String result ="";int count =0;
        System.out.println(reverse(strings,result,count));
    }
    private String reverse(String[] s,String result,int count){
        while(s.length!=count){
            count++;
            result += s[s.length-count] +" ";
            reverse(s,result,count);
        }
        return result;
    }
}