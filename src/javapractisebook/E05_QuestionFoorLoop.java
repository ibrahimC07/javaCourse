package javapractisebook;

public class E05_QuestionFoorLoop {
    public static void main(String[] args) {

        /*
        Type code to draw the following image by using a for loop.
         A A A A A
         A A A A A
         A A A A A
         */

        int row=3;
        int column=5;


        for (int i = 1; i <=row ; i++) {
           String s = "";
            for (int j = 1; j <=column ; j++) {
                s=s +"A ";

            }
            System.out.println(s);

            }

        }

    }

