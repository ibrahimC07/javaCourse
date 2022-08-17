package javapractisebook;

public class E06_QuestionFoorLoop {
    public static void main(String[] args) {

        /*
        Type code to draw the following image by using a for loop.
        A
        A A
        A A A
        A A A A
         */

        int rows=4;
        for (int i = 1; i <=rows ; i++) {
            String s="";
            for (int j = 1; j <=i ; j++) {
                s=s+"A ";

            }
            System.out.println(s);

        }
    }
}
