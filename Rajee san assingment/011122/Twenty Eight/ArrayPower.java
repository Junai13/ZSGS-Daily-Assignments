package november.twentyeight;

import java.util.Scanner;

public class ArrayPower {
    public static void main(String[] args) {
        ArrayPower process = new ArrayPower();
        process.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]= sc.nextInt();
        System.out.println("enter the power: ");
        int power = sc.nextInt();
        sc.close();
        process(arr,size,power);
    }
    private void process(int[] arr,int size,int power){
        for(int i=0;i<size;i++){
            int temp = arr[i];
            for(int j=1;j<power;j++)
                arr[i] *= temp;
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+"  ");
    }
}
