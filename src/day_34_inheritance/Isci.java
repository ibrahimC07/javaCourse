package day_34_inheritance;

public class Isci extends Personel{
    /*
    normal hayatimizda paretn cocuk sahibi olmaya karar verebilir
    Java'da ise child klaslar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.
     */

    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim); //  Isim belirtilmedi
        //kedi classimizda isim variable yok, onun icin parent'a gideriz
        isci1.isim = "Selim";
        System.out.println(isci1.persNo);// 1001 kendi klassminizda varsa onu kullaniriz

        isci1.maas(); // Tum personelin maasi vardir




    }

    @Override
    public void maas() {
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }


}








