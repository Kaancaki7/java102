package inheritiance;

public class Lecturer extends Academician{
    private String doorNumber;
    public Lecturer(String nameSurname,String mbPhone,String eMail,String department,String title,String doorNumber){
        super(nameSurname,mbPhone,eMail,department,title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
}
