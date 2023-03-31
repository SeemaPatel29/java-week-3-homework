package javaweek3hw;

import java.util.Arrays;

//17. Write a Java program to sort a numeric array and a string array.
public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Numeric Array declaration
        int [] numArray = {
                1789,2035,1899,2040,1950,2255,7897,1455,787};
        //String array declaration
        String[]strArray = {
                "Alpha","Beta","Delta","Hotel","Mile","Sierra","Peter","Kilo"};
        System.out.println("Actual Numeric Array was :" + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numeric array is ;" + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Array was :" + Arrays.toString(strArray));
        // sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : " + Arrays.toString(strArray));


    }

}
