package javaweek3hw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    static int number;
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        number = scanner.nextInt();
        isitOddEvenNumber();
        //closing  the scanner object
        scanner.close();
    }
    //checking the number is even or odd
    public static void isitOddEvenNumber(){
        //ternary operator is used
        String evenOrOdd = (number %2 ==0)? "Even ": "Odd";
        System.out.println("The  " +  number + "is " +  evenOrOdd + "number");
    }
}
