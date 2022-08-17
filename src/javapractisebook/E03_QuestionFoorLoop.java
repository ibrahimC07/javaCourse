package javapractisebook;

public class E03_QuestionFoorLoop {
    public static void main(String[] args) {

        /*
        Type code to check whether a String is palindrome or not. If a String is the same with its reverse
         then it is called palindrome. For example; “anna”,  “123321” are palindromes.
         */

        String a= "annsfha" ;




        String b = "" ;
        for (int i = a.length()-1; i >=0 ; i--) {
            String c= a.substring(i,i+1);
            b=b+c;





        }
        if (a.equals(b)){
            System.out.println(b + " is palindrome");
        }else
            System.out.println(b+" is not palindrome");





    }
}
