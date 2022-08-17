package day_20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E03_English {

    public static void main(String[] args) {

        // Create a String array by getting elements from user
        //Type code to put elements in alphabetical order
        //Type code to print the total number of characters in the first and the last String

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array");
        int length = input.nextInt();

        String arr[] = new String[length];

        for (int i = 0; i <arr.length ; i++) {

            System.out.println("Enter the "+ (i+1)+". element" );

            arr[i]= input.next();



        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int numOfCharInFirstElement= arr[0].length();
        int numOfCharInLasttElement=arr[arr.length-1].length();


        System.out.println(numOfCharInFirstElement+numOfCharInLasttElement);

    }
}
