package day_15_overloading_forLoop;

public class C02_Overloading {

    public static void main(String[] args) {
        /*
        Java'da olusturdugunuz method'larin isminin yaptigi islev ile uyumlu olmasini isteriz.
        mesela bir Stringin bir bolumunu almak icin Java
        substring() method'lari veya
        Verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve
        parametlerinin data turune gore karar verir
         */

        String str="Bu Java ogrenilecek baska yolu yok";
        str.substring(2);
        str.replace('c','v');
        str.replace("J","H");


        /*
        Ayni isimde ama farkli method'lari olusturmak icin
        degistirebilecegi seyler
        1- parametre sayisi
        2- ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
        3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
           parametrelerin siralanisi
         */

    }

}
