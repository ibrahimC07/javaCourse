package day_20_arrays;

import java.util.Arrays;

public class E01_English {
    public static void main(String[] args) {
        /*
        1)Arrays are for storing multiple data
        2)An array can have just a single data type
        3)Arrays can store just primitive data types or references of non-primitive
         */

        //How to create an Array
        int ages[] = new int[4];

        ages[0] = 12;
        ages[1] = 20;
        ages[2] = 11;
        ages[3] =9;

        System.out.println(Arrays.toString(ages));

        // How to print array elements one by one

        System.out.println(ages[2]);//11

        //print the sum of the ages array elements on the console

        //1.Way
        System.out.println(ages[0]+ages[1]+ages[2]+ages[3]); //52

        //2.Way:

        int sum = 0;
        for (int i = 0; i <ages.length ; i++) {
            sum=sum+ages[i];

        }
        System.out.println(sum); //52

        //How to create an array and assign values in short way
        String names[] = {"tom", "Jim", "Alex", "Karl"};
        System.out.println(Arrays.toString(names));

        //Find the total number of characters in array elements
        int total = 0 ;
        for (int i = 0; i < names.length ; i++) {
            total= total+ names[i].length();


        }

        System.out.println(total); //14
    }
}
