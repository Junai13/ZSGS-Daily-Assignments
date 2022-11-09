package eightnov;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        StringSort sort = new StringSort();
        sort.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int size = sc.nextInt();
        String[] strings = new String[size];
        System.out.println("Enter the string");
        sc.nextLine();
        for(int i=0;i<size;i++)
            strings[i] = sc.nextLine();
        sortString(strings,size);
    }
    private void sortString(String[] strings,int size){
        String temp;
        int minimum;
        for(int i=0;i<size;i++){
            minimum =i;
            for(int j=i+1;j<size;j++){
                if(strings[minimum].compareTo(strings[j])>0)
                    minimum=j;
            }
            if(minimum != i){
                temp = strings[i];
                strings[i] = strings[minimum];
                strings[minimum] =temp;
            }

        }
        System.out.println(Arrays.toString(strings));
    }
}

