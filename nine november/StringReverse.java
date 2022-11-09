package ninenov;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        StringReverse reverse = new StringReverse();
        reverse.getInput();
    }
    private void getInput(){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test>0) {
            String string1 = sc.nextLine();
            process(string1);
            test--;
        }
    }
    private void process(String string1){
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(string1);
        reverseString.reverse();
        int count=0;
        int size=reverseString.length();
        for(int i=size-1,j=size-1;i>=0;)
        {
            while(i>=0 && string1.charAt(j)!=reverseString.charAt(i))
        {
            i--;
            count++;
        }
            if(i>=0)
            {
                i--;
                j--;
            }
        }
        System.out.println(count);
    }
}
