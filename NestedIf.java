package sep.seven;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int amount = 100000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin: ");
        int pin = sc.nextInt();
        if(pin== 1234){
            System.out.println("Enter the amount you want to be withdraw: ");
            int withdraw = sc.nextInt();
            if(withdraw<=amount){
                System.out.println("Your request is processing");
                System.out.println("...........................");
                System.out.println("..................");
                System.out.println("............");
                System.out.println(".......");
                System.out.println("Please collect your cash");
                System.out.println("...........................");
                System.out.println("Remaining balance is: " + (amount-withdraw));


            }else{
                System.out.println("Please enter the correct amount");
            }
        }else{
            System.out.println("Enter correct pin");
        }


    }
}
