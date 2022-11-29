package november.twentyeight;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString task = new ReverseString();
        task.getInput();
    }

    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        getReverse(arr);
        System.out.println(new String(arr));
    }

    private void getReverse(char[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (!(arr[start] >= 'A' && arr[start] <= 'z'))
                start++;
            else if (!(arr[end] >= 'A' && arr[end] <= 'z'))
                end--;
            else {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }
    }

}
