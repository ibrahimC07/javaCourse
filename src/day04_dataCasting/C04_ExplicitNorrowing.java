package day04_dataCasting;

public class C04_ExplicitNorrowing {

    public static void main(String[] args) {

        int sayi1=130;
        byte sayi2=(byte) sayi1;
        System.out.println(sayi2); //

        /*
        genis data turundeki degeri dar data turundeki vcriable atamak isterseniz
        java sizin genis data turundeki degerin , dar data turunun sinirlarina uyup
        uymayacagini calistarana kadar bilmez
        ama java risk almaz
        riski sifira indirmek icin burada bir sorun olursa
        sorumlulugu kabul etmenizi bekler
        bunun icin degerin onune parantez icerisinde istedgimiz data turunu
        yazmamiz yeterlidir.


        bu riski istlendigimizde 3 durum olusabilir
        1- bizim degerimiz, dar kalip degerlerine uygun olursa hic bir kayip olamdan cast olur
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsniz
        3-genis kaliptan degeri dar kaliba koydugunuzda; sinirlari asan durumlarda
           veri baskalasabilir.
         */


    }
}
