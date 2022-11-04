package collection;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //compareTo->karşılaştırma.
        return o1.getName().compareTo(o2.getName());
    }
}
