package day_16_forloop;

public class E05_Question {
    public static void main(String[] args) {
        /*
        Print the following structure on the console
        Week:1
        Day: 1
        Day: 2
        ...
        ..
        Week:2
        Day: 1
        Day: 2
        ...
        ..

         */
        int weeks=5;
        int days=7;

        for (int i = 1; i <=weeks ; i++) {
            System.out.println("Week:"+i);
            for (int j =1 ; j <=days; j++) {
                System.out.println(" Day:"+j);

            }
        }


    }
}
