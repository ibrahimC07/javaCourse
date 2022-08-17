package javapractisebook;

public class E04_QuestionFoorLoop {
    public static void main(String[] args) {
        //Type code to print the unique digits in an integer. Example; 223878 ⇒  37

        int num = 223878;
        String s= String.valueOf(num);
        String d="";

        for (int i = 0; i <s.length() ; i++) {
            String c= s.substring(i,i+1);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c+" ");
            }


        }


    }
}
