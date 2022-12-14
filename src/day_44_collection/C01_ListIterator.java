package day_44_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
        public static void main(String[] args) {
        /*
        Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri
        silen bir program yaziniz …                                           (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */
            List<Integer> liste = new ArrayList<>();
            liste.add(2);
            liste.add(13);
            liste.add(56);
            liste.add(23);
            liste.add(45);
            liste.add(14);
            liste.add(40);
            System.out.println(liste); // [2, 13, 56, 23, 45, 14, 40]
         ListIterator list1= liste.listIterator();
         int bas=20;
         int bitis=40;

         while (list1.hasNext()){
             Integer temp= (Integer) list1.next();
             if (temp<bas|| temp>bitis){
                 list1.remove();
             }
         }
            System.out.println(liste);
        }
    }
