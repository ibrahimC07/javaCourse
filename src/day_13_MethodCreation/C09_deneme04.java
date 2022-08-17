package day_13_MethodCreation;

import java.util.Scanner;

public class C09_deneme04 {

    public static void main(String[] args) {
      /*
      Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim yaziniz");
        String isim=scan.nextLine();

        if (isim.length()>3){
            System.out.println("3 harf giriniz sadece");
        }

        if (isim.contains("\\w")){
            System.out.println("isim ayni karakterlere sahiptir");
        }else System.out.println("Dizenin benzersiz karakterleri var");
    }
}
