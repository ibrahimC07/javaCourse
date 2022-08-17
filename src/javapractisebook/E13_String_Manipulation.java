package javapractisebook;

public class E13_String_Manipulation {
    public static void main(String[] args) {

        String input= "  MiaMi" ;

      String  input2= input.trim().toLowerCase();

      input2= input2.substring(0,1).toUpperCase()+input2.substring(1);

        System.out.println(input2);

        //2.soru


        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";
        Integer c1 = name1.replaceAll("\\s","").length();
        Integer c2 = name2.replaceAll("\\s","").length();
        Integer c3 = name3.replaceAll("\\s","").length();
        System.out.println("Total number of characters different from space: " + (c1 + c2 + c3));

        //3.soru

        /*
        Create a String variable, print the total number of alphabetical and numeric characters in
        the String on the console.
        Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console
         */

        String input3= " Miami 33018!!!" ;

        int a = input3.trim().replaceAll("\\W","").length();

        System.out.println(a);

        /*
        Create a String variable, print the number of non-digit characters in the String on the
        console.
        Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
         */

      String input4= "1a3Bcf4!...";

      int sonuc1= input4.trim().replaceAll("\\d","").length();

      System.out.println(sonuc1);

      /*
      5)
      Create a String variable and print just the last non-space character on the console for any
      String.
      Example: For ‘Ali Can’ you should print n
      For ‘Miami ’ you should print i etc.

       */

      String s = "Miami ";
      int idxOfLastNonSpace = s.trim().length()-1;
      String lastNonSpaceChar = s.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
      System.out.println("The non-space last character: " + lastNonSpaceChar);

      /*
      6)
      Create a String variable and find the sum of the ASCII values of the first and the last
      characters of the String.
       */



      String asci = "Miami";
      int indexOfLastChar = asci.length()-1;
      int AsciiOfFirst = asci.charAt(0);
      System.out.println(AsciiOfFirst);
      int AsciiOfLast = asci.charAt(indexOfLastChar);
      System.out.println("Total ASCII values of first and last chars: " + (AsciiOfFirst + AsciiOfLast));

      /*
      Create a String variable and print all characters except the last character on the console in
      uppercases.
      Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
       */

      String a4= "Java" ;

      String a5= a4.trim().toUpperCase().substring(0,a4.length()-1);
      System.out.println(a5);

      /*
      Type code to check if a String has just a single space character any position in the middle
      Example: For ‘Ali Can’ your code should print false on the console
      For ‘ Ali Can ’ your code should print false on the console
      For ‘ Ali Can ’ your code should print false on the console
      For ‘Ali Can’ your code should print true on the console

       */

      String a6= "  Ali Can";

      String a7=a6.trim();

      if (a7.replaceAll("\\S","").length()==1){
        System.out.println("true");
      }else System.out.println("false");

      /*
      Type code to check if a String has a specific single character or not in three different ways
       */

      String s2 = "Java";
      Boolean result = s2.contains("v");
      System.out.println("Does the character exist? " + result);




    }
}
