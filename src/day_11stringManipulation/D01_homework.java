package day_11stringManipulation;

public class D01_homework {

    public static void main(String[] args) {

        String input= "Java ogrenmek cok zevkli";
        String harf= "g";

        if (input.contains(harf)){
            System.out.println("girdiginiz harf kelimede geciyor");
        }else {
            System.out.println("girdiginiz harf kelimede gecmiyyor");
        }
    }
}
