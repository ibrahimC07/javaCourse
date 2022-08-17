package day_23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class English {
    public static void main(String[] args) {
        /*
        1-) Arrays are fixed in length which is not good but Lists have flexible length
        2-)Arrays can store just primitives and references but Lists store non-primitives
        3-)Arrays is faster than Lists
        4-)Arrays use memory less than Lists

         */

        // How to create a List(ArrayList)
        //1.Way: Mostly used
        List<Integer> al = new ArrayList<>();
        //2.Way: It is true to use
        ArrayList<Integer> bl = new ArrayList<>();

        //How to print a list on the console
        System.out.println(al); // [] ==>empty List

        //how to add elements into a List
        //add() method puts the elements in insertion order
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al); //[12,21,5]
        al.add(2,99);
        System.out.println("al.size() = " + al.size());

        // Create a list and add even integers between 13 and 51 in descending order


        List<Integer> cl = new ArrayList<>();

        for (int i = 51; i >12 ; i--) {
            if (i%2==0){
                cl.add(i);
            }



        }
        System.out.println(cl);


        List<Integer> dl = new ArrayList<>();
        dl.add(12);
        dl.add(21);
        dl.add(32);
        dl.add(45);
        //Remove 21 from the list fl
        dl.remove(dl.indexOf(21));
        System.out.println(dl);


    }
}
