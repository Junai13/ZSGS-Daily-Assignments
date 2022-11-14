package fourteennov;

import java.util.Arrays;
import java.util.Scanner;

public class RailStation {
    public static void main(String[] args)
    {
        RailStation railStation = new RailStation();
        railStation.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of arrival time");
        int arr = sc.nextInt();
        System.out.println("Enter the list of arrival time: ");
        int[] arrival = new int[arr];
        sc.nextLine();
        for(int i=0;i<arr;i++){
            String str = sc.nextLine();
            String[] s = str.split(":");
            arrival[i] = Integer.parseInt(s[0]+s[1]);
        }
        System.out.println("Enter the list of a departure time: ");
        int[] departure = new int[arr];
        for(int i=0;i<arr;i++){
            String str = sc.nextLine();
            String[] s = str.split(":");
            departure[i] = Integer.parseInt(s[0]+s[1]);
        }
        findPlatform(arrival,departure,arr);
    }
    private void findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
            else if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            if (plat_needed > result)
                result = plat_needed;
        }

        System.out.println("Minimum number of stations required: " +result);
    }

}
