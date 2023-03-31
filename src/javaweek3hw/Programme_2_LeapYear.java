package javaweek3hw;

import java.util.Scanner;

/*
2. Write a java program to input any year like (ex.2007) and find out if
*it is leap year or not?
 */
public class Programme_2_LeapYear {

    public static void main(String[] args) {
        //Scanner decalration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year :");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isitLeapYear(year);
        //closing the scanner object
        scanner.close();
    }
    //checking is it leap year or not
    public void isitLeapYear(int year){
        if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println("The year" + year + "is leap year");
            return;
        }
        System.out.println("The year" + year + "is not a leap year");
    }
}
