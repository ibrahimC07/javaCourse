package day_21_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class English03 {
    public static void main(String[] args) {
        // check if the array elements are in the natural order.
        // "A","B", "C" ==>  true ,  "A","C","B" ==>  false

        String arr[]= { "A","C","B"};

        String copyArr[]= new String[arr.length];

        int idx = 0;

        for (String w : arr){
            copyArr[idx]=w;
            idx++;
        }

        Arrays.sort(copyArr);

        if (Arrays.equals(arr,copyArr)){
            System.out.println("Array elements are in alphatecial order");
        }else System.out.println("Array elements are nor in alphatecial order");


        // Check if a specific element exist an an Array
        //if the element exist return the index of the element
        //if the element doesn't exist return a message

        int crr[] = {10,5,6,8,11,54};

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int i=scan.nextInt();

        Arrays.sort(crr);

        int result = Arrays.binarySearch(crr,i);
        System.out.println(result);

        if (result<0){
            System.out.println("element dosen't exist");
        }else System.out.println("element exist");
    }
}
