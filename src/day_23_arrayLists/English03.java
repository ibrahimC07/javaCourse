package day_23_arrayLists;

import java.util.Arrays;
import java.util.List;

public class English03 {
    public static void main(String[] args) {

        /*
        From a given List find all pairs whose sum is a given number
        {4,6,5,-10,8,5,20}=>10
        For example; 4+6=10, 5+5=10,-10+20=10,
         */
        List<Integer> list = Arrays.asList(4, 6, 5, -10, 8, 5, 20);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i)+list.get(j)==10){
                    System.out.println("(list.get(i) + \" - \" + list.get(j)) = " + (list.get(i) + " and " + list.get(j)));
                }


            }
            }
        }
    }
