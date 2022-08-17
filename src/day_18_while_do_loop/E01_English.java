package day_18_while_do_loop;

public class E01_English {
    //Type code to print the integers divisible by 4 and 6 from 13 to 211
    //1.Way: by using for=loop

    public static void main(String[] args) {
        for (int i = 13; i <222 ; i++) {

            if (i%4==0 && i%6==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        //2.Way by using while=loop

        int i=13;


        while (i<222){

            if (i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println("");

        //Type code to print integers from 3 to 5 by using loop
        int a=3;

        while (a<6){
            System.out.println(a);
            a++;
        }


    }

}
