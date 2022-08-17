package day_22_multiDimensionalArrays;

public class English01 {
    public static void main(String[] args) {

        // example : find the sum of the max and min element in an integer multidimensional array

        int err [][] = {{5,2},{11,13,15},{6},{-2,3,5,12}};

        int max = err[0][0];
        int min = err[0][0];
        for (int[] w :err){

            for (int u : w){

                if (max>u){
                    max=u;
                }
                if (min<u){
                    min=u;
                }


            }
        }
        System.out.println(max+min);
    }
}
