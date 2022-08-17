package day_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class English04 {
    public static void main(String[] args) {
        /*
        Count the words in a String one by one
        String is "Ali came to school and Ayse came to school"
        Ali=1, came=2, to=2, school=2, and=1, Ayse=1,
         */

        String str= "Ali came to school, Ayse came to school.";

      String strWithoutPunctuation=  str.replaceAll("\\p{Punct}","");
        System.out.println(strWithoutPunctuation);

      String words[] = strWithoutPunctuation.split(" ");
        List<String> wordsList= new ArrayList<>();

        for (String w : words){
            wordsList.add(w);
        }

        String word = "";
        int counter = 1;

        for (int i = 0; i <wordsList.size() ; i++) {
            word= wordsList.get(i);
            for (int j = (i+1); j <wordsList.size(); j++) {
                if (word.equals(wordsList.get(j))){
                    counter++;
                    wordsList.remove(j);
                    j--;
                }
                System.out.println(word + " - "+ counter);
                counter=1;

            }

        }




    }
}
