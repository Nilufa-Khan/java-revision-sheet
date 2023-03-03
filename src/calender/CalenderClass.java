package calender;


import java.util.Scanner;
public class CalenderClass {
    //write code to display the calender
    public void displayCalender(){
        int month, year,firstDayOfWeek, daysInMonth=0;
        String spaces="  ";
        //declare variables for month, year, firstDay and daysInMonth
        //Declare Scanner object to take input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
        month= sc.nextInt();
        System.out.println("Enter Year:");
        year=sc.nextInt();
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        firstDayOfWeek= sc.nextInt();
        //check leap year
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            daysInMonth=31;
        }
        else if (month==4||month==6||month==9||month==11)
        {
            daysInMonth=30;
        }else if (month==2)
        {
            if ((year%400==0)&&(year%4==0)&&(year%100!=0))
            {
                daysInMonth=29;
            }else {
                daysInMonth=28;
            }
        }else {
            System.out.println("Invalid Month");
        }
        System.out.println("S  M  Tu  W  Th  F  S");
        for (int i=1;i<=firstDayOfWeek;i++)
        {
            System.out.printf("%3s",spaces);
        }
        for (int j=1;j<=daysInMonth;j++)
        {
            System.out.printf("%3d",j);
            if ((firstDayOfWeek+j)%7==0)
            {
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) {
        CalenderClass calenderClass = new CalenderClass();
        calenderClass.displayCalender();
    }
}