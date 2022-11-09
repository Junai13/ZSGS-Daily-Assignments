package eightnov;

import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        FrequencyCount frequencyCounting = new FrequencyCount();
        frequencyCounting.getInput();
    }
    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        frequencyCount(list, size);
    }
    private void frequencyCount(int[] list,int size){
        int temp;
		List<Integer> frequencyList = new ArrayList<>();
		ArrayList<Integer> outputList = new ArrayList<>();
		for (int i : list) {
			if (outputList.contains(i)) {
				frequencyList.set(outputList.indexOf(i), frequencyList.get(outputList.indexOf(i)) + 1);
			} else {
				outputList.add(i);
				frequencyList.add(outputList.indexOf(i), 1);
			}
		}
		for (int i = 0; i < frequencyList.size(); i++) {
			for (int j = i + 1; j < frequencyList.size(); j++) {
				if (frequencyList.get(i) < frequencyList.get(j)) {
					temp = frequencyList.get(i);
					frequencyList.set(i, frequencyList.get(j));
					frequencyList.set(j, temp);
					temp = outputList.get(i);
					outputList.set(i, outputList.get(j));
					outputList.set(j, temp);
				}
				else if(frequencyList.get(i).equals(frequencyList.get(j)) &outputList.get(i)>outputList.get(j)) {
					temp = outputList.get(i);
					outputList.set(i, outputList.get(j));
					outputList.set(j, temp);
				}
			}
		}
		for (int i = 0; i < frequencyList.size(); i++) {
			for (int j = 0; j < frequencyList.get(i); j++) {
				System.out.print(outputList.get(i) + " ");
			}
		}
	}
}