package collection;

//NOTLARA GÖRE SIRALAMA YAPMASI İÇİN BİR SINIF OLUŞTURDUK.
import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {
    @Override
    //compare metodu tüm elemanları birbirleri ile karşılaştırır.
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote();
    }
}
