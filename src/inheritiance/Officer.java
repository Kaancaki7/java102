package inheritiance;

public class Officer extends Employee{
    private String department;
    private String shift;

    public Officer(String nameSurname, String mbPhone, String eMail, String department, String shift) {
        super(nameSurname, mbPhone, eMail);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " began work");
    }
}

