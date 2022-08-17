package javapractisebook;

public class E08_QuestionFoorLoop {
    public static void main(String[] args) {
        /*
        Type code to print all lowercase characters
         in a String with an asterix. For example; 'Ali Can?' ==> l*i*a*n*
         */

      String s= "Ali Can?";
      String t= "";
      String c= s.replaceAll("[^a-z]","");

        for (int i = 0; i <c.length() ; i++) {
           String g= c.substring(i,i+1);
           t=t+g+"*";


        }
        System.out.println(t);

    }
}
