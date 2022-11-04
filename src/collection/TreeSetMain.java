package collection;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Student> student = new TreeSet<>(new OrderNoteComparator()); //sıralama sınıfımızı TreeSet'in içine attık.
        //not sıralamasını küçükten büyüğe yapıcak.büyükten küçüğe olmasını istersen
        //TreeSet<Student> student = new TreeSet<>(new OrderNoteComparator().reverse()); eklemesi yapabilirsin.

        //İsme göre sıralama yapmak için de :
        //TreeSet<Student> student = new TreeSet<>(new OrderNameComparator());
        student.add(new Student("Kaan",98));
        student.add(new Student("Ahmet",55));
        student.add(new Student("Cemre",75));
        student.add(new Student("Zeynep",85));
        student.add(new Student("Damla",25));

        for (Student stu : student) {
            System.out.println(stu.getName() + " -> " + stu.getNote());
        }


    }
}
