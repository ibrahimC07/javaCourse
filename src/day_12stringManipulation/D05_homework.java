package day_12stringManipulation;

public class D05_homework {

    public static void main(String[] args) {

        String input= "tata";

        String tersinput=input.substring(3)+
                input.substring(2,3)+ input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersinput);
    }
}
