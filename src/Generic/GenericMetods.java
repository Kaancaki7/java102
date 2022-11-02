package Generic;


public class GenericMetods {

    //generic metot :
    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String[] a = {"java","102","patika","dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'j','a','v','a'};

        printArray(a);
        printArray(b);
        printArray(c);

    }
}
