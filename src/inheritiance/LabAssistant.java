package inheritiance;

public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String mbPhone, String eMail, String department, String title, String officeTime) {
        super(nameSurname, mbPhone, eMail, department, title, officeTime);
    }

    public void takeLab() {
        System.out.println(this.getNameSurname() + " entered lab classes");
    }
}
