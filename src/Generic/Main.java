package Generic;

import nested.Out;

public class Main {
    public static void main(String[] args) {
        Integer a = null;

        NullableInteger n = new NullableInteger(a);
        n.print();

        //içine ilkel veri tipi kullanamazsın int gibi -> Integer yazacaksın mesela.
        //generic sınıfının kullanımı :

        Integer b = 12;
        String c = "abc";
        Nullable<Integer> s = new Nullable<>(b);
        s.print();

        Nullable<String> k = new Nullable<>(c);
        k.print();

        //birden fazla kullanabilirsin elmaslar içinde test sınıfının kullanımı :

        Integer j = 10;
        String h = "kaan";
        Double p = 21.7;
        Test<Integer,String,Double> t = new Test<>(j,h,p);

        t.setObj1(24);  //böyle de set metoduyla değiştirebilirz değerleri
        t.showInfo();


    }
}
