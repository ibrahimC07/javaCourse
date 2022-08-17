package javapractisebook;

public class E10_QuestionFoorLoop {
    public static void main(String[] args) {

        //Type code to reverse a String. Example; Mark ==> kraM

        String s= "Mark";

        String t="";
        for (int i = s.length()-1; i >=0 ; i--) {
            String a= s.substring(i,i+1);
            t=t+a;


        }
        System.out.print(t);
        char ch = 'a';

        while(ch<'d') {

            System.out.print(ch + " ");

            ch++;

        }
    }
}
