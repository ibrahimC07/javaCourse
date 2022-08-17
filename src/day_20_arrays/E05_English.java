package day_20_arrays;

public class E05_English {
    public static void main(String[] args) {

        //Create an integer array and print all the elements less than 5
        //[12, 3, -3, 5, 23] ==> 3, -3

        int arr[] = {12, 3, -3, 5, 23};

        //1.Way; use regular loops(for-while-do while)

        int i = 0;

        while (i<arr.length){

            if (arr[i]<5){
                System.out.print(arr[i] + " ");
            }
            i++;
        }
        System.out.println();

      //  2.Way : Use for-each loop(Enhanced Loop) (for-each loop can be used just with arrays and collections)

        for (int w : arr){
            if (w<5){
                System.out.print(w + " ");
            }

        }
    }
}
