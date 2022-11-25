package gelecegiyazanlar.sonpart.streamapi3;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private int no;
    private String isim;
    private int yas;

    public Ogrenci() {

    }

    public Ogrenci(int no,String isim,int yas) {
        this.no = no;
        this.isim = isim;
        this.yas = yas;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public int hashCode() {
        return this.no;
    }

    @Override
    public boolean equals(Object object) {
        Ogrenci ogrenci = (Ogrenci)object;
        return ogrenci.no == this.no;
    }

    @Override
    public String toString() {
        return "No : " + this.no + " ,İsim : " + this.isim + " ,Yas : " + this.yas;
    }
}
