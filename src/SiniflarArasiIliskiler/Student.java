package SiniflarArasiIliskiler;

public class Student {
    private String name;
    private String surName;
    private String idNo;
    private String adress;
    private int note;

    Student(String name,String surName,String idNo,String adress,int note) {
        this.name = name;
        this.surName = surName;
        this.idNo = idNo;
        this.adress = adress;
        this.note = note;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName(){
        return this.surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdNo() {
        return this.idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAdress() {
        return this.adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNote() {
        if (note > 100 || note < 0) {
            System.out.println("100 den buyuk ve 0 dan kucuk not girilemez!");
            note = 0;
        }
        return this.note;
    }
    public void setNote(int note) {
        this.note = note;
    }
}
