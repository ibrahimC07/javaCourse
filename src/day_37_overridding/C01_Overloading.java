package day_37_overridding;

public class C01_Overloading {
    public static void main(String[] args) {
        /*
        Bir class'da ayni isimde ve ayni signature'a sahip iki method olmaz
        Ayni classta ayni isimde birden fazla method olusturmak istersek
        mutlaka signature'i degistirmeliyiz

        farkli class'larda ayni isim ve signature'a sahip iki method oloabilir mi?
         */
    }
    void ekleme(){
    }
    void ekleme(int sayi){
    }
    void ekleme(String str){
    }
    void ekleme(String str,int sayi){
    }
    void ekleme(int sayi,String str){
    }
}
