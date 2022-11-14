package fourteennov;

import java.util.HashMap;
import java.util.Scanner;

public class KeyPad {
    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        keyPad.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the squence of string: ");
        String pattern = sc.nextLine();
        String[] number = pattern.split("-");
        int len = number.length;
        keypadPattern(number,len);
    }
    static final HashMap<Character,String> map = new HashMap<>(){{
        put('1', "");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "");
    }} ;
    private void keypadPattern(String[] arr,int length){
        String result = "";
        String temp;
        for(String s:arr){
            if(map.containsKey(s.charAt(0))) {
                temp = map.get(s.charAt(0));
                result += temp.charAt(s.length()-1);
            }
        }
        System.out.println(result);

    }
}
