package 第三次作业;

import java.util.Scanner;

public class code5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The year is : ");
        int year = input.nextInt();
        System.out.print("The first day is: ");
        int day = input.nextInt();
        String[] str = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("January 1, " + year + " is " + str[day]);
        day += 31;
        System.out.println("February 1, " + year + " is " + str[day % 7]);
        int num = 0;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            num = 29;
        } else {
            num = 28;
        }
        day += num;
        System.out.println("March 1, " + year + " is " + str[day % 7]);
        day += 31;
        System.out.println("April 1, " + year + " is " + str[day % 7]);
        day += 30;
        System.out.println("May 1, " + year + " is " + str[day % 7]);
        day += 31;
        System.out.println("June 1, " + year + " is " + str[day % 7]);
        day += 30;
        System.out.println("July 1, " + year + " is " + str[day % 7]);
        day += 31;
        System.out.println("August 1, " + year + " is " + str[day % 7]);
        day += 31;
        System.out.println("September 1, " + year + " is " + str[day % 7]);
        day += 30;
        System.out.println("October 1, " + year + " is " + str[day % 7]);
        day += 31;
        System.out.println("November 1, " + year + " is " + str[day % 7]);
        day += 30;
        System.out.println("December 1, " + year + " is " + str[day % 7]);
    }
}
