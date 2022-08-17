package recal_day_04;

import java.util.Scanner;

public class Q01_StrinManipulation {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');
        System.out.println(bosluk);
        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.isEmpty());

    }
}
