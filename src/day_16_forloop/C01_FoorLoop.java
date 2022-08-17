package day_16_forloop;

public class C01_FoorLoop {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim


        int sayi=120;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                System.out.print(i+",");
            }

        }
    }
    }
