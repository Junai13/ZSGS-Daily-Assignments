package november.twentyeight;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        UnionIntersection task = new UnionIntersection();
        task.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the first array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter the elements of the first array: ");
        for(int i=0;i<size;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter the size the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array: ");
        for(int i=0;i<size2;i++)
            arr2[i]=sc.nextInt();
        union(arr1,arr2);
        intersection(arr1,arr2,size,size2);
        exception(arr1,arr2,size,size2);
    }
    private  void union(int[] arr1,int[] arr2){
        Set<Integer> set = new LinkedHashSet<>();
        for(Integer i:arr1)
            set.add(i);
        for(Integer i : arr2)
            set.add(i);
        System.out.println("Union of the array: ");
        for(Integer i:set)
            System.out.print(i +" ");
    }
    private void intersection(int[] arr1,int[] arr2,int size1,int size2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i]==arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Intersection of the array: ");
        for(Integer i:list)
            System.out.print(i+"  ");
    }
    private void exception(int[] arr1,int[] arr2,int size1,int size2){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size1;i++){
            if(arr1[i]%2 != 0)
                list.add(arr1[i]);
        }
        for(int i=0;i<size2;i++){
            if(arr2[i] % 2 ==0)
                list.add(arr2[i]);
        }
        System.out.println("\nException of array: ");
        for(Integer i:list)
            System.out.print(i+"  ");
    }
}
