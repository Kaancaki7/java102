package inheritiance;

public class Employee {
    private String nameSurname;
    private String mbPhone;
    private String eMail;

    public Employee(String nameSurname,String mbPhone,String eMail) {
        this.nameSurname = nameSurname;
        this.mbPhone = mbPhone;
        this.eMail = eMail;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMbPhone() {
        return this.mbPhone;
    }

    public void setMbPhone(String mbPhone) {
        this.mbPhone = mbPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void entry() {
        System.out.println(this.nameSurname + " entered the university");
    }

    public void exit() {
        System.out.println(this.nameSurname + " dropped out of the university");
    }

    public void diningHall() {
        System.out.println(this.nameSurname + " entered the dining hall");
    }
}
