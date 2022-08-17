package day09_practise.restoruant;

public class Mutfak {

    public String yemkeler= "adanakebap , urfaciger, kusleme";
    public String araSicak= "yaylacorba , mercimek, duguncorba,corba";
    public String tatlilar= "baklava ,sutlac,gullac,kazandibi,kunefe";
    public String icecekler= "ayran , salgam, kola";

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {

        this.yemkeler=adanakebab;
        this.araSicak=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;
    }

    public Mutfak() {

    }


    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemkeler='" + yemkeler + '\'' +
                "\naraSicak='" + araSicak + '\'' +
                "\ntatlilar='" + tatlilar + '\'' +
                "\nicecekler='"+ icecekler+ '\'' +
                '}';
    }
}
