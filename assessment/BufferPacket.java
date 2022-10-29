package assessment;

import java.util.*;

public class BufferPacket {
    public static void main(String[] args) {
        BufferPacket buffer = new BufferPacket();
        buffer.packet();
    }
    private void packet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of packets: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of the packets:");
        Map<Integer,String> map = new HashMap<>();
        int max=0;String s="";
        for(int i=0;i<number;i++){
            String str = sc.nextLine();
            if(max<str.length()){
                max=str.length();
                s = str;
            }
            String[] split = str.split("-");
            map.put(Integer.valueOf(split[0]),split[1]);

        }
        List<Integer> arr = new ArrayList<>();
        for(Integer i:map.keySet()){
            arr.add(i);
        }
        int[] temp = new int[number];
        for(int i=0;i<number-1;i++){
            for(int j=i+1;j< number;j++){
                if(arr.get(i) < arr.get(j)){
                    temp[i] = arr.get(i);
                    temp[i+1] = arr.get(j);
                }
            }
        }
        /*for(int i=0;i<number;i++)
            System.out.println(temp[i]);*/
        //Collections.sort(arr);
        /*for(int i=0;i<number;i++){
            System.out.print(map.get(arr.get(i)));
        }
        */
        for(int i=0;i<number;i++){
            System.out.print(map.get(temp[i]));
        }
        System.out.println("Buffer packet with maximum length: " +max + "is " +s);
    }
}
