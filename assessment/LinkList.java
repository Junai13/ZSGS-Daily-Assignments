package assessment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.zeroOneTwo();
    }
    private void zeroOneTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the list");
        List<Integer> list = new LinkedList<>();
        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(Integer i: list)
            System.out.println(i);
    }
}
