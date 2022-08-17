package day_16_forloop;

public class C05_FoorLoop {

     /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz
         */
     public static void main(String[] args) {
         int sayi1 = 10 ;
         int sayi2= 12 ;

         toplamaMethodu(sayi1,sayi2);


     }

    public static void toplamaMethodu(int sayi1, int sayi2) {
         int toplam=0 ;
         if (sayi1<sayi2)
        for (int i = sayi1; i <=sayi2 ; i++) {
            toplam+=i ;
        }else
             for (int i = sayi2; i <=sayi1 ; i++) {
                 toplam+=i ;
             }
        System.out.println(toplam);

    }
}

