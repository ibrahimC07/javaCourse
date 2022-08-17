package day_17_nestediforloop;

public class E01_Question {
    public static void main(String[] args) {

        //Type code to find the sum of integers from 10 to 14

        int s=0;
        for (int i = 10; i <15 ; i++) {
            s=s+i;
// if you put that inside the loop body you will see the sum value for every loop
            // if you want to see the final sum value put it after the loop

        }
        System.out.println(s);

        // type code to find the multiplication of integers from 10 to 14

        int multip=1;
        for (int i = 10; i <15; i++) {
            multip=multip*i;

        }
        System.out.println(multip);
    }
}
