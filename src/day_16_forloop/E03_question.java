package day_16_forloop;

public class E03_question {
    public static void main(String[] args) {

        // interview question
        //Type code to reserve a String
        //Tom Hanks==> ...

        String s = "Tom Hanks" ;

        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));

        }
        System.out.println();
        //Type code to find the sum of the digits of an integer
        //2534==> 14

        int sumDigits=0;
        for (int i = 237; i >0 ; i=i/10) { // int num=237 ; yazarakta cozulebilrsin i'nin yerine num yazacan sadece
            sumDigits=sumDigits+i%10;
        }
        System.out.println(sumDigits);
    }
}
