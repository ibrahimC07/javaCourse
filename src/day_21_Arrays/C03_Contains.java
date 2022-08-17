package day_21_Arrays;

public class C03_Contains {
    public static void main(String[] args) {

        //Soru 3- Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.

        String [] isimler = {"Basak", "Nurullah" , "Fatih" ,"adem", "enes"};
        String arananKelime= "Basak" ;

        boolean sonuc= contains (isimler, arananKelime);

        if (sonuc){
            System.out.println("Girilen isim lisede var");
        }else System.out.println("Girilen isim listede yok");
    }

    public static boolean contains(String[] isimler, String arananKelime) {

        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].equalsIgnoreCase(arananKelime)){
                sonucMethod=true;
            }

        }

        return sonucMethod;


    }
}
