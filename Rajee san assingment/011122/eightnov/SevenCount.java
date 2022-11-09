package eightnov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SevenCount {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SevenCount countSort = new SevenCount();
        countSort.getInput();
    }
    private void getInput(){
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        process(size);
    }
    private void process(int size){
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(int i =0;i<size;i++){
            int num = sc.nextInt();
            if(num !=7)
                list.add(num);
            else
                count++;
        }
        while (count-->0)
            list.add(7);
        System.out.println(list);
    }
}
