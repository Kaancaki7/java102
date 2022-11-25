package gelecegiyazanlar.lambda.ornek3;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

    public enum Cinsiyet {
        ERKEK,KADIN
    }

    private String isim;
    private LocalDate dogumTarihi;
    private String eMail;
    private Cinsiyet cinsiyet;

    public Kisi() {

    }

    public Kisi(String isim,LocalDate dogumTarihi,String eMail,Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.eMail = eMail;
        this.cinsiyet = cinsiyet;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getDogumTarihi() {
        return this.dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getYas() {
        return  LocalDate.now().getYear() - dogumTarihi.getYear();

    }

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Cinsiyet getCinsiyet() {
        return this.cinsiyet = cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public int hashCode() {
        return eMail.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Kisi kisi = (Kisi)o;
        return this.eMail.equals(kisi.eMail);
    }

    @Override
    public String toString() {
        return "Isim : " + this.isim + ",Dogum tarihi : " + this.dogumTarihi + ",E-Mail : " + this.eMail + ",Cinsiyet : " + this.cinsiyet + ",yas : " + getYas();
    }
}
