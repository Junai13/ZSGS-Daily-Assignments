package octthiryone;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultiply {
    public static void main(String[] args) {
        ArrayMultiply multiply= new ArrayMultiply();
        multiply.getinput();
    }
    private void getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.println("Enter the elements os array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            result[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j)
                    result[i] = result[i]*arr[j];
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
