package day_15_overloading_forLoop;

public class C09_Deneme01 {
    public static void main(String[] args) {
        //ekrana 10 kez Java guzeldir yazdirin

        String str= "Java guzeldir";

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+" : "+str);

        }

        //10 ile 30 arasindaki (10-30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin


        for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");


        }
        //100'den baslayarak 50'ye(dahil) kadar olan
        // sayilari aralarinda virgul olarak ayni satirda yazdirin

        System.out.println();
        for (int i = 100; i >=50 ; i--) {
            ;
            System.out.print(i+",");

        }

        /*
        Kullanicidan 100'den kucuk bir tamsayi isteyin.1'den baslayarak
        girilen sayiya kadar 3'un kati olan sayilari yazdirin
         */
        System.out.println();
        int sayi= 99 ;

        if (sayi<100){
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i+",");
                }

            }
        }else System.out.println("yuzden kucuk giriniz");

        }

    }

