package november.seventeen;

import java.util.Scanner;

public class CharecterCount {
    public static void main(String[] args) {
        CharecterCount charecterCount = new CharecterCount();
        charecterCount.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        process(str);
    }
    private void process(String str){
        int length = str.length();
        for(int j=0; j<length; j++)
        {
            char ch = str.charAt(j);
            int count = ((int)str.charAt(++j)-48);
            if(j+1 >= length)
            {
                for(int i=0; i<count; i++)
                    System.out.print(ch);
                break;
            }
            if (((int)str.charAt(j+1)-48)>-1 && ((int)str.charAt(j+1)-48)<10)
            {
                count = (count*10) + ((int)str.charAt(++j)-48);
            }
            for(int i=0; i<count; i++)
                System.out.print(ch);
        }
    }
}
