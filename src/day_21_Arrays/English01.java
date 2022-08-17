package day_21_Arrays;

import java.util.Arrays;

public class English01 {
    public static void main(String[] args) {

        // Type code to chech if 2 given arrays have exactly same elements
        //arr[]=[12, 3, -5, 14]           brr[]=[14, -5, 12, 3]

        int[] arr= {12,3,-5,14};
        int[] brr={14,-5,12,3};

        Arrays.sort(arr);
        Arrays.sort(brr);

        boolean areTheySame = Arrays.equals(arr,brr);
        System.out.println("areTheySame = " + areTheySame);

        //Type code to check if a specific element exist in an array or not

        String crr[] = {"Java", "Selenium", "Api", "Sql"};

         String expectedEleements= "Sql";
         int counter=0;
         for (String w : crr){
             if (w.equals(expectedEleements)){
                 counter++;
             }
         }
         if (counter>0){
             System.out.println("The array has the ecpected elements");
         }else System.out.println("The array doesn't have the ecpected elements");

         //Type code check if the number of usage of specific element in an array
        //[12,2,23,-5,12,23,12] ==>12 was used 3 times


        int drr[] = {12,2,23,-5,12,23,12};
        int expectedElement1=12;
        int counter1=0;

        for (int w : drr){
           if (w==expectedElement1){
               counter1++;
           }
        }
        if (counter1>0){
            System.out.println(counter1+" times "+ expectedElement1+ " used in the array");
        }else System.out.println(counter1+"is used in the array");


    }
}
