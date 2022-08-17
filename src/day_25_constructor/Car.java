package day_25_constructor;

public class Car {

    /*
    Bu class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve methodlaribu classda belirleriz

    sonra farkli classlarda araba olusturmamiz gerekirse
    bu classdan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretir
     */

    String marka= "Marka belirtilmedi";
    String model= "Model belirtilmedi";
    int yil;
    public int fiyat;


    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+"km hiz yapar");
    }
}
