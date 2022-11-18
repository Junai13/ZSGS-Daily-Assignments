package november.seventeen;
/*1) Write a program to sort the elements in odd positions in descending order and elements in ascending order*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AscendingDescending {
    public static void main(String[] args) {
        AscendingDescending ascendingDescending = new AscendingDescending();
        ascendingDescending.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int size = arr.length;
        int[] inputArr = new int[size];
        for(int i=0;i<size;i++)
            inputArr[i] = Integer.parseInt(arr[i]);
        process(inputArr,size);
        /*List<Integer> list = new ArrayList<>();
        for(String s:arr)
             list.add(Integer.valueOf(s));
        process(list,size);*/
    }
    private void process(int[] arr,int size){
        int[] odd = new int[size/2+1];
        int[] even = new int[size/2];
        for(int i =0; i<size;i++){
            if(i%2==1)
                even[i/2] = arr[i];
            else odd[i/2] = arr[i];
        }
        for(int i=1;i<size/2+1;i++){
            int j=i;
            int a=odd[i];
            while((j>0)&&odd[j-1]>a){
                odd[j]=odd[j-1];
                j--;
            }
            odd[j]=a;
        }
        for(int i=0;i<size/2-1;i++){
            for(int j=i+1;j<size/2;j++){
                if(even[i]>even[j]){
                    int temp = even[i];
                    even[i]=even[j];
                    even[j]=temp;
                }
            }
        }
        //Arrays.sort(even);
        for(int i=0;i<size/2+1;i++){
            System.out.println(odd[size/2-i]);
            try{
                System.out.println(even[i]);
            }catch (IndexOutOfBoundsException e){ }
        }
    }
}
