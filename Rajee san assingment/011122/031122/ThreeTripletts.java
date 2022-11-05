package octthiryone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeTripletts {
    public static void main(String[] args) {
        ThreeTripletts triplets = new ThreeTripletts();
        triplets.findTriplet();
    }
    private void findTriplet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int length= sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<int[]> list = new ArrayList<>();
        int[] temp = new int[3];
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        temp[0]=arr[i];temp[1]=arr[j];temp[2]=arr[k];
                        Arrays.sort(temp);
                        list.add(temp);
                    }
                }
            }
        }
        for (int[] a:list){
            for(int b:a)
                System.out.println(b);
        }
    }
}
