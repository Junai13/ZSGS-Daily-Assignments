package november.twentyeight;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayReverse process = new ArrayReverse();
        process.getInput();
    }

    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter no of element to be reverse: ");
        int rev = sc.nextInt();
        sc.close();
        reverse(arr, size, rev);
    }

    private void reverse(int[] arr, int size, int rev) {
        for (int i = 0; i < size; i += rev) {
            int left = i;
            int right = i + rev - 1 < size - 1 ? i + rev - 1 : size - 1;
            int temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + "  ");
    }

}
