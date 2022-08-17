package day_39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'dan bilgisayarmizdaki bir dosyaya erismek istiyorsak
        fileInputStream Class'indan yardim alabiliriz
        Ayni sekilde Java'dan bilgisayarmizadaki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutputStream Class'sindan yardim alabilirz
         */

        FileInputStream fis= new FileInputStream("src/day_39_Exceptions/test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum Compile Time Error degildir
        Java'da bazi exception'larda Compile Time Exception'dir
        ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dir


        Compile time exception olustugunda Java cozum icin 2 ihtimal onerir
        1-)try-catch ile cevrelemek
        2-)method signature'ina throws keyword ile beklenen exception turunu yazmak


        throws Exception , sadece olayin farkinda oldugumuzun declarasyonudur
        exception'in handle edilmesinde hicbir rolu yoktur
        yani try-catch ile kontrol altina aldigimiz exception'lar da
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilarsa
        hic birsey yapmamisiz gibi hata mesaji yayinlayip , calismayi durdurur




         */
    }
}
