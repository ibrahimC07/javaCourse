package day_21_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class English02 {
    public static void main(String[] args) {

        //Sort the array elements according to their lengths.
        // ["michael", "Ali", "Maria","Veli"]==> "Ali"-"Veli" - "Maria" - "Michael"

        String arr [] = {"michael", "Ali", "Maria","Veli"};

        Arrays.sort(arr, Comparator.comparing(String::length)); // .reversed() yaparsan descending order olur
        // ondan sonra .thenComparing(Comparator.naturalOrder())) ayni karakterde olanlari alfabetik siraya gore dizer
        System.out.println(Arrays.toString(arr));





    }
}
