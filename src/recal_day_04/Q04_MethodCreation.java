package recal_day_04;

public class Q04_MethodCreation {
    public static void main(String[] args) {
        /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
       */

        birkereYazdir("abafdgdfdsgvs");
        

    }

    private static void birkereYazdir(String abafdgdfdsgvs) {
        String output = "" ;

        for (int i = 0; i<abafdgdfdsgvs.length() ; i++) {

            if (!output.contains(abafdgdfdsgvs.substring(i,i+1))){

                output+=abafdgdfdsgvs.substring(i,i+1);

            }
            System.out.println(output);
            
        }
    }
}
