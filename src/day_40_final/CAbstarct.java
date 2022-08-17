package day_40_final;

public abstract class CAbstarct {

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();

   void cikarma(){
       System.out.println("Bu method cikarma yapar");
    }
    /*
    bir methodun basina abstract yazarsaniz
    bu methodun child classlar icin bir standart oldugunu declare ederiz
    ve method body'sine ihtiyac kalmaz
     */
}
