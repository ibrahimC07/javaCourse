package day_21_Arrays;

import java.util.Arrays;

public class English04 {
    public static void main(String[] args) {

        // Find the longest word in a String
        //1.way
        String[] sentence = {"java","easy","for","you","studious"};

        System.out.println("enUzunKelime(sentence) = " + enUzunKelime(sentence));
    }

    private static String enUzunKelime(String[] sentence) {
        String uzunKelime=sentence[0];

        for (int i = 0; i <sentence.length; i++) {
            if (sentence[i].length()>uzunKelime.length()){
                uzunKelime=sentence[i];
            }

        }
        System.out.println(uzunKelime);

        return uzunKelime;



    }


    }

