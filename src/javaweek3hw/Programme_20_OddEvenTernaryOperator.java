package javaweek3hw;

import java.util.Scanner;

public class Programme_20_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number = scanner.nextInt();
        isitOddOrEvenNumber(number);
        // closing scanner
        scanner.close();
    }
    // checking the number is even ot odd
    public static void isitOddOrEvenNumber(int number){
        // ternary operator is used
        String evenOrOdd = (number %2 ==0) ? "Even " : "Odd";
        System.out.println("The" + number + "is "+ evenOrOdd + "number");
    }
}
