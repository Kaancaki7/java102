package SiniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Kaan","Caki","077","Isparta",100);
        Student st2 = new Student("Faik","Yilmaz","031","Izmir",85);
        Student st3 = new Student("Kadan","Kadan","000","Nevsehir",55);

        Instructor teacher = new Instructor("Erol","Cakir","English");
        Course mat = new Course("Matematik","MAT101",teacher);

        Student[] stu = {st1,st2,st3};

        //Burada dependency(bağımlılık) uygulandı.
        System.out.println("Ortalamanız : " + mat.calcAverage(stu));

        //öğretmenin ismini yazmasını bekleriz.Burada composition uygulandı.
        System.out.println(mat.getInstructor().getName());
    }
}
