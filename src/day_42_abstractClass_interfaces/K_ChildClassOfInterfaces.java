package day_42_abstractClass_interfaces;

public class K_ChildClassOfInterfaces implements IO2_Interfaces,IO3_Interfaces{
    /*
      Bir class'i bir interface'e child yapmak icin implements keyword kullanilir
      implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(IO3_Interfaces.SAYI); // 20
        System.out.println(IO2_Interfaces.SAYI); // 20

    }
}
