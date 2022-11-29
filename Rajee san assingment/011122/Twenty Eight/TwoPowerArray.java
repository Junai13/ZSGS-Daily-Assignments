package november.twentyeight;

import java.util.Scanner;

public class TwoPowerArray {
    public static void main(String[] args) {
        TwoPowerArray task = new TwoPowerArray();
        task.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements in array: ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        process(arr,size);
    }
    private void process(int[] arr,int size){
        int[] twoArr = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,
        131072,262144,524288,1048576,2097152,4194304,83388608};
        int[] output = new int[size];
        int excess =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<24;j++){
                if((arr[i]+excess)==twoArr[j]){
                    output[i] = arr[i];
                    break;
                }
                else if((arr[i]+excess)<twoArr[j] &&j!=0){
                    output[i] = twoArr[j-1];
                    excess = Math.abs(twoArr[j-1]-(arr[i]+excess));
                    break;
                }
            }
        }
        System.out.println("New Array: ");
        for (int i=0;i<size;i++)
            System.out.print(output[i]+"  ");
        System.out.println("\nExcess at last position: "+excess);
    }
}