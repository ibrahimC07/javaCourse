package day07_ifStatements;

import java.util.Scanner;

public class D03_Homework {

    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
        kare olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenar uzunluklarini \naralarda entera basarak giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        if(kenar1 == kenar2){
            System.out.println("bir karedir");
        }
        if(!(kenar1 == kenar2)){
        }
    }
}


