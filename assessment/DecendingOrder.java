package assessment;


import java.util.*;

public class DecendingOrder {
    public static void main(String[] args) {
        DecendingOrder order = new DecendingOrder();
        order.frequencyOrder();
    }

    private void frequencyOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        List<Integer> array = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            array.add(sc.nextInt());
        }
        for (Integer i : array) {
            map.put(i, map.getOrDefault(i, Collections.frequency(array, i)));
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (Integer i : map.values()) {
            list.add(i);
        }
        List<Integer> temp = new ArrayList<>();
        //int[] temp = new int[list.size()];
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    temp.add(i, list.get(j));
                    temp.add(i + 1, list.get(i));
                } else if (list.get(i) == list.get(j))
                    temp.add(list.get(i));
            }
        }
        System.out.println(temp);
        for (int i = 0; i < temp.size() - 1; i++) {
            if (map.containsValue(temp.get(i))) {
                for (int j = 0; j < temp.get(i); j++) {
                    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                        if(Objects.equals(entry.getValue(), temp.get(i))){
                            System.out.print(entry.getKey());
                        }
                    }
                }
            }

        /*int[] temp = new int[number];
        for(int i=0;i<number-1;i++){
            for(int j=i+1;j< number;j++){
                if(arr.get(i) < arr.get(j)){
                    temp[i] = arr.get(i);
                    temp[i+1] = arr.get(j);
                }
            }
        }*/
        /*for(int i=0;i<temp.length;i++)
            System.out.println(temp[i]);*/
            // Collections.sort(list);
            //System.out.println(list);
       /* for(int i=temp.length-1;i>0;i++){
            if(map.containsValue(temp[i])){
                for (int j=0;j< temp[i];j++){
                    System.out.println(map.get(i));
                }
            }
        }*/
        }
    }
}