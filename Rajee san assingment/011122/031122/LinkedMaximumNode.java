package octthiryone;

import java.util.*;
public class LinkedMaximumNode {
    public static void main(String[] args) {
        LinkedMaximumNode node = new LinkedMaximumNode();
        node.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of list: ");
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
            list.add(sc.nextInt());
        int maxi = Collections.max(list);
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i+1;j<n;j++){
                if(maxi == list.get(i))
                    max=0;
                else if(max< list.get(j)){
                    max= list.get(j);
                }
            }
            arr[i]=max;
        }
        System.out.println(Arrays.toString(arr));
    }
}