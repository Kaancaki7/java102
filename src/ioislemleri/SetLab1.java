package ioislemleri;

import java.util.*;

public class SetLab1 {

    public static void doldur(SortedSet<Integer> integers, int sutunS) {
        integers.clear();
        Random random = new Random();
        while (integers.size() < sutunS) {
            int sayi = random.nextInt(49) + 1;
            integers.add(sayi);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedSet<Integer> integers = new TreeSet<>();
        System.out.print("satir sayisi giriniz:");
        int satirS = sc.nextInt();
        System.out.print("sutun sayisi giriniz:");
        int sutunS = sc.nextInt();
        for (int i = 0 ; i < satirS; i++) {
            doldur(integers,sutunS);

            Iterator<Integer> itr = integers.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next() + "\t");
            }
            System.out.println();
        }


    }
}
