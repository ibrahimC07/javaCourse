package day07_ifStatements;

import java.util.Scanner;

public class D05_Homework {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu \naralarda enter olacak sekilde giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3){
            System.out.println("Bu bir EŞKENAR UCGENDIR");
        } else if (!(kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3)) {
            System.out.println("Bu bir ESKENAR UCGEN DEGILDIR");

        }

        }


    }

