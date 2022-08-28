package lambda_practice;

public class MyMethods {// seed(tohum) methodlar create edildi


    public static void yazdir(Object obj){
        System.out.print(obj+" ");
    }

    public static boolean ciftElemaniBul(int x){
        return x%2==0;
        //2.yol return x%2!=1;
    }
    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);

   }
}

