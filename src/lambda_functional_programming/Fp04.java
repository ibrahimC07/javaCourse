package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {

        System.out.println("yedidenYuzeKadarOlanSayilar() = " + yedidenYuzeKadarOlanSayilar());
        System.out.println("ikidenOnBireKadarCarpim() = " + ikidenOnBireKadarCarpim());
        System.out.println("faktoriyelHesaplama(5) = " + faktoriyelHesaplama(1));
        System.out.println("verilenIkiSayiArasindakiCiftSayilarinToplamini(5,11) = " + verilenIkiSayiArasindakiCiftSayilarinToplamini(5, 11));
        System.out.println("ikiSayiArasindakiTumSayilarinRakamlariToplami(23,31) = " + ikiSayiArasindakiTumSayilarinRakamlariToplami(23, 32));
    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static int yedidenYuzeKadarOlanSayilar(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();

    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int ikidenOnBireKadarCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static int faktoriyelHesaplama(int x){
        if (x>=0){
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("O'dan buyuk sayi giriniz");
        return 0;
    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int verilenIkiSayiArasindakiCiftSayilarinToplamini(int x, int y){
        int z = 0;
        if (x>y){
            z=x;
            x=y;
            y=z;
        }
        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemaniSec).reduce(Math::addExact).getAsInt();
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x, int y){
        int z = 0;
        if (x>y){
            z=x;
            x=y;
            y=x;
        }
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).reduce(Math::addExact).getAsInt();
    }
}
