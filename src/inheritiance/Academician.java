package inheritiance;

public class Academician extends Employee{
    private String department;
    private String title;
    Academician(String nameSurname,String mbPhone,String eMail,String department,String title) {
        super(nameSurname, mbPhone, eMail);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendClass() {
        System.out.println(this.getNameSurname() + " entered the class");
    }

    @Override
    public void entry() {
        System.out.println(this.getNameSurname() + " academician entered the university");
    }
}
