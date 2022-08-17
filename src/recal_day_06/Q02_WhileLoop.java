package recal_day_06;

public class Q02_WhileLoop {
    public static void main(String[] args) {
        /*
       Girilen bir sayiya kadar olan sayilardan sadece tek olanlarin ekrana yazdiriniz
       girilen sayi dahil(tek ise)
         */

        int sayi = 15;

        int count=0;
        while (sayi>0){
            if (sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;
        }

        System.out.println("count :"+count);
    }
}
