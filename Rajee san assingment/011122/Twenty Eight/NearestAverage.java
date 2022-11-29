package november.twentyeight;

import java.util.Scanner;

public class NearestAverage {
    public static void main(String[] args) {
        NearestAverage task = new NearestAverage();
        task.getInput();
    }
    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sort(arr,size);
        System.out.println(process(arr,(sum/size),size));
    }
    private void sort(int[] arr,int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    private int process(int arr[], int avg, int size) {
        if (avg <= arr[0])
            return arr[0];
        if (avg >= arr[size - 1])
            return arr[size - 1];
        int i = 0, j = size, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (arr[mid] == avg)
                return arr[mid];
            if (avg < arr[mid]) {
                if (mid > 0 && avg > arr[mid - 1])
                    return getClosest(arr[mid - 1], arr[mid], avg);
                j = mid;
            }
            else {
                if (mid < size - 1 && avg < arr[mid + 1])
                    return getClosest(arr[mid], arr[mid + 1], avg);
                i = mid + 1;
            }
        }
        return arr[mid];
    }
    private int getClosest(int val1, int val2, int target) {
        if (target - val1 >= val2 - target)
            return val2;
        else
            return val1;
    }
}
