package november.seventeen;

import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        FindSubString findSubString = new FindSubString();
        findSubString.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println(isSubString(str1,str2));
    }
    private int isSubString(String str1,String str2){
        int len1=str1.length();
        int len2 = str2.length();
        for(int i=0;i<len1;i++){
            if(i+len2<len1  && str1.substring(i,i+len2).equals(str2))
                return i;
        }
        return -1;
    }
}
