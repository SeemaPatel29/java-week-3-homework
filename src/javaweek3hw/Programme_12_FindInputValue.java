package javaweek3hw;

import java.util.Scanner;

//12. Write a program that tells us input value is number or an alphabet or symbol.
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch = scanner.next().charAt(0);
        // object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkinputValueisAlphabetNumberOrSymbol(ch);
        // closing scanner
        scanner.close();
    }
    // find the input value is alphabet,digit and symbol
    public void checkinputValueisAlphabetNumberOrSymbol(char ch){
        if ((ch >= 'a' && ch <= 'z') ||(ch >='A' && ch <= 'Z') ){
            System.out.println(ch + " is an AlPHABET");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT");
        }else {
            System.out.println(ch + " is a SYMBOL");
        }
    }
}
