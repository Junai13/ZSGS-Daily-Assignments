package elevennov;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateDifference {
    static int daysOfMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        DateDifference dateDifference = new DateDifference();
        dateDifference.getInput();
    }
    private void getInput(){
        String d1 = inputValidator();
        String d2 = inputValidator();
        String[] temp1= d1.split("/");
        String[] temp2= d2.split("/");
        Date date1 = new Date(Integer.parseInt(temp1[0]),Integer.parseInt(temp1[1]),Integer.parseInt(temp1[2]));
        Date date2 = new Date(Integer.parseInt(temp2[0]),Integer.parseInt(temp2[1]),Integer.parseInt(temp2[2]));
        System.out.println("\n\nDifference between two dates : " +getDifference(date1,date2) );
    }
    private String inputValidator() {
        Pattern reg = Pattern.compile("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("\nEnter Date : ");
        input = sc.nextLine();
        Matcher matcher = reg.matcher(input);
        if (matcher.matches())
            return input;
        else {
            System.out.println("Invalid input or invalid format of input!!");
            return inputValidator();
        }
    }
    private int getDifference(Date date1, Date date2)
    {
        int days1 = date1.year * 365 + date1.datee;
        for (int i = 0; i < date1.month - 1; i++)
        {
            days1 += daysOfMonths[i];
        }
        days1 += countLeapYears(date1);

        int days2 = date2.year * 365 + date2.datee;
        for (int i = 0; i < date2.month - 1; i++)
        {
            days2 += daysOfMonths[i];
        }
        days2 += countLeapYears(date2);
        return Math.abs(days2 - days1);
    }
    private int countLeapYears(Date date)
    {
        int years = date.year;
        if (date.month <= 2)
        {
            years--;
        }
        return (years / 4) - (years / 100) + (years / 400);
    }
}
class Date
{
    protected int datee;
    protected int month;
    protected int year;

    public Date(int datee, int month, int year)
    {
        this.datee = datee;
        this.month = month;
        this.year = year;
    }

}