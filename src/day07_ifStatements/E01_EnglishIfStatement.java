package day07_ifStatements;

import java.util.Scanner;

public class E01_EnglishIfStatement {

    // ask user to enter the password then check if the password is valid or not according to the given rules
    //1)at least 8 characters 2)contains at least 1 uppercase 3)contains at least 1 lowercase
    // 4) contains at least 1 symbol

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.next();

        if (pwd.length()<8){
            System.out.println("Password is invalid because it doesn't have at least 8 characters");

        }else if ((pwd.replaceAll("[^A-Z]","")).length()==0){
            System.out.println("Password is invalid because it doesnt have at least one uppercase");

        }else if ((pwd.replaceAll("[^a-z]","")).length()==0){
            System.out.println("Password is invalid because it doesnt have at least one lowercase");
        } else if ((pwd.replaceAll("\\W","")).length()==0){

            System.out.println("Password is invalid because it doesnt have at least one symbol");
        }else System.out.println("Password is valid,welcome to Chase bank");


        }




    }




