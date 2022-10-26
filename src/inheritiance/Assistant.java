package inheritiance;

public class Assistant extends Academician{
    private String officeTime;

    public Assistant(String nameSurname, String mbPhone, String eMail, String department, String title, String officeTime) {
        super(nameSurname, mbPhone, eMail, department, title);
        this.officeTime = officeTime;
    }

    public String getOfficeTime() {
        return this.officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }

    public void takeAQuiz() {
        System.out.println(this.getNameSurname() + " did a quiz");
    }
}
