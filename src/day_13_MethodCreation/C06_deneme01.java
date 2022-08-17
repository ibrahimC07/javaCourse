package day_13_MethodCreation;

public class C06_deneme01 {
    public static void main(String[] args) {
        /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

    Input :

     John White

      1234234534561478

     Output : Name :

      J*** W****

      CCN : **** **** **** 1478

      Ilk Harfler Buyuk harf ile baslamalidir.
     */

        String nameSurname= "John White" ;
        String ccn= "1234234534561478";

        String ilkharf=nameSurname.substring(0,1);
        String geriyeKalanlar=nameSurname.substring(1).replaceAll("ohn White","***");
        String surname=nameSurname.substring(5,6);
        String surnameGeriye=nameSurname.substring(6).replaceAll("\\w", "*");
        String sonDort=ccn.substring(12,16);
        String geriyeKalanlar1=ccn.substring(0).replaceAll("123423453456","**** **** **** ");
        System.out.println(ilkharf+geriyeKalanlar+surname+surnameGeriye+"\n"+"CCN  :" +" "+geriyeKalanlar1);

    }


}
