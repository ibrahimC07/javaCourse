package recall_day_07;

public class Q04_Arrays {
    public static void main(String[] args) {

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str=str.replace(" ","");

        String harf[] = str.split("");
        System.out.println(harf.length);
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] = str1.split("");
        int boslukSayisi = kelime.length-1;

    }
}
