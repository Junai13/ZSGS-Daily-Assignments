package elevennov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatDetails {
    public static void main(String[] args) {
        SeatDetails seatDetails = new SeatDetails();
        seatDetails.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sear number: ");
        int seatNumber = sc.nextInt();
        if(seatNumber<=0 || seatNumber>72){
            System.out.println("Please enter a valid seat number");
            getInput();
        }else
            seatDetails(seatNumber);
    }
    private void seatDetails(int number){
        int[] sideBreath = new int[]{7,8,15,16,23,24,31,32,39,40,47,48,55,56,63,64,71,72};
        List<Integer> sideSeat = new ArrayList<>();
        for(int i:sideBreath){
            sideSeat.add(i);
        }
        if(sideSeat.contains(number) && number%2==1)
            System.out.println("Seat Number:" +number+"\nSide Lower Breath");
        else if (sideSeat.contains(number) && number % 2 == 0) {
            System.out.println("Seat Number:" +number+"\nSide Upper Breath");
        }else{
            if(number%3==0)
                System.out.println("Seat Number:" +number+"\nUpper Breath");
            else if (number%3==1) {
                System.out.println("Seat Number:" +number+"\nMiddle Breath");
            } else if (number % 3 == 2) {
                System.out.println("Seat Number:" +number+"\nLower Breath");
            }
        }
    }
}
