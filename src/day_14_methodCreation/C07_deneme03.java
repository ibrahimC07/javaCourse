package day_14_methodCreation;

import java.util.Scanner;
import java.util.SortedMap;

public class C07_deneme03 {

    public static void main(String[] args) {

        String eMail=eMailAl();
        System.out.println("mailiniz :"+eMail);
    }

    public static String eMailAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz");
        String mail=scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("Gecersiz e-mail adresi");
        }else if (!mail.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi giriniz");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("Yazimda bir sorun var kontrol edin");
        }else System.out.println("tebrikler,basariyla kaydedldi");
        return mail ;
    }

}
