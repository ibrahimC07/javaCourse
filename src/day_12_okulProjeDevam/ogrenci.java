package day_12_okulProjeDevam;

public class ogrenci extends Kisi{
    private String ogrenciNo;
    private String sinif;

    public void ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
      // super(adSoyad, kimlikNo, yas); burda hata veriyor bak
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public ogrenci(){
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString();
    }
}
