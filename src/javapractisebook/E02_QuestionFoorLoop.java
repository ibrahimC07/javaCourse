package javapractisebook;

public class E02_QuestionFoorLoop {

   // Type code to print repeated characters in a String. For example; accessories ⇒ ces

    public static void main(String[] args) {

        String s = "caecssories" ;

        String d= "";
        for (int i = 0; i <=s.length()-1 ; i++) {
            String a = s.substring(i,i+1);
            if (s.indexOf(a) != s.lastIndexOf(a)){
                if (!d.contains(a)){
                    d=d+a;
                }

            }

        }
        System.out.print(d +" ");
    }
}
