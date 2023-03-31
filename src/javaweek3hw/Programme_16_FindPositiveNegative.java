package javaweek3hw;
/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // closing scanner
        scanner.close();
    }
    // Finding the number is positive negstive or zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if (number >0){
            System.out.println(number + " is a Positive Number ");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number ");
        }else {
            System.out.println(number + " is Zero ");

        }
    }
}
