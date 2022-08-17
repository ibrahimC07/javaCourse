package day_44_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        // Soru 4) Bir listedeki elementleri iterator kullanarak
        // sondan basa dogru yazdirin
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        // sondan basa gelebilmek icin
        // once sona gitmek lazim
     ListIterator list1= liste.listIterator();

     while (list1.hasNext()){
         list1.next();
     }
     while (list1.hasPrevious()){
         System.out.print(list1.previous()+ " ");
     }
    }
}
