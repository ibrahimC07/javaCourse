package day_24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile arraydeki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz
        ancak bu methodun 2 tane kotu yan etkisi var
        -Arrays class'i kullanildigi icin array ozellikleri gecerli olur
        dolayisiyla list'te olan add, remove gibi size'i degistiren methodlar
        bu sekilde olusturulan List'lerde kullanilmaz
        -kaynak olan array ile urun olan list ozdeslestirilir
        birisine yapilan degisiklik, otomatik olarak digerlerine de islenir
         */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

       // 1.yan etki

       // sinifList.add("Erdi"); // .UnsupportedOperationException

       // sinifList.remove(1); //.UnsupportedOperationException

        // 2.yan etki

        arr[1]="Emre";
        System.out.println("degisim sonrasi array :"+Arrays.toString(arr));
        System.out.println("Array'i degistirince list :"+sinifList);


        sinifList.set(0,"Utku");

        System.out.println("List'i degistirince list :"+sinifList);
        System.out.println("List'i degisitrince array :"+Arrays.toString(arr));


    }
}
