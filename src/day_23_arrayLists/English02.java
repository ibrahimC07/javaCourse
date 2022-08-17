package day_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class English02 {
    public static void main(String[] args) {
        //Create an integer List , add 5 elements in it, remove the even elements, change the odd elements to 22
        //[12,3,7,24,11] ==> [22,22,22]

        List<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11);

        for (int i = 0; i <al.size() ; i++) {
            if (al.get(i)%2==0){
                al.remove(i);
            }
            if (al.get(i)%2==1){
                al.set(i,22);
            }

        }
        System.out.println(al);

        //Create an integer list which has repeated elements then remove the duplicates
        //[2,3,2,2,3,5]==> [2,3,5]

        List<Integer> bl= new ArrayList<>();
        bl.add(2);
        bl.add(3);
        bl.add(2);
        bl.add(2);
        bl.add(3);
        bl.add(5);
        List<Integer> uniqueList = new ArrayList<>();

        //1.Way
//        for (int i = 0; i <bl.size() ; i++) {
//            if (!uniqueList.contains(bl.get(i))){
//                uniqueList.add(bl.get(i));
//            }
//
//        }
//        System.out.println(uniqueList);


        //2.way

        for (Integer w : bl){
            if (!uniqueList.contains(w)){
                uniqueList.add(w);
            }
        }
        System.out.println(uniqueList);


















    }
}
