package day_17_nestediforloop;

public class C03_NesteFoorLoop {
    public static void main(String[] args) {
        /*
  verilen yukseklik ve boy degerine gore
  *'lardan olusan bir dikdortgen olusturalim
  yukseklik :3  boy:4
  ****
  ****
  ****
 */
        int raw=3;
        int boy=4;

        for (int i = 1; i <=raw ; i++) {
            String s = "";
            for (int j = 1; j <=boy ; j++) {
                s=s+"*";

            }
            System.out.println(s);

        }
    }
}
