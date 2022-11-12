package elevennov;

import java.util.Scanner;

public class PrefixSearch {
    public static void main(String[] args) {
        PrefixSearch prefixSearch = new PrefixSearch();
        prefixSearch.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<size;i++)
            arr[i]= sc.next();
        System.out.println("Longest Common Prefix: "+longestPrefix(arr,size));
    }
    private String  longestPrefix(String[] arr,int length) {
        String prefix = "";
        if (arr == null || arr.length == 0)
            return prefix;
        int min = arr[0].length();
        for (int i = 1; i < length; i++)
            min = Math.min(min, arr[i].length());
        for (int i = 0; i < min; i++) {
            char current = arr[0].charAt(i);
            for (String s : arr) {
                if (s.charAt(i) != current)
                    return prefix;
            }
            prefix += current;
        }
        return prefix;
    }
}