package javapractisebook;

public class E09_QuestionFoorLoop {
    public static void main(String[] args) {
        /*
        Type code to print digits just in the decimal part of the given decimal
         number with an asterix. For example; 75.4238 Ş *4*2*3*8
         */

        double d= 75.4238;
        String s= String.valueOf(d);
        String decimal=s.split("\\.")[1];
        String t= "";

        for (int i = 0; i <decimal.length() ; i++) {
            String y= decimal.substring(i,i+1);
            t=t+"*"+y;


        }
        System.out.println(t);
    }
}
