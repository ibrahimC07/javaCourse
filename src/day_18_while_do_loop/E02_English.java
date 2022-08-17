package day_18_while_do_loop;

public class E02_English {
    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not
        //Palindrome: 121==>121

        int a=12156;
        String b =a+"";
        String c="";


        for (int i = b.length()-1; i >=0 ; i--) {
            c=c+b.substring(i,i+1);

        }
        System.out.println(c);
        if (c.equals(b)){
            System.out.println("is palindrome");
        }else System.out.println("is not palindrome");

        int d=121;
        String e=d+"";
        int f=e.length()-1;
        System.out.println(f);
        String g="";
        while (f>=0) {
            g = g + e.substring(f, f+1 );
            f--;

        }
        if (g.equals(e)){
            System.out.println("polindrome");
        }



    }
}
