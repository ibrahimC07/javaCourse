package recal_day_06;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayinin basamaklarindaki rakamlarin toplamini bulunuz.

        Scanner scan=new Scanner(System.in);

        int sayi = scan.nextInt();

        basamaktoplami(sayi);
        System.out.println(basamaktoplami(sayi));
    }

    private static int basamaktoplami(int sayi) {
        int toplam=0;
        while (sayi !=0){
            toplam+=sayi%10;
            sayi/=10;
        }

        return toplam;
    }
}
