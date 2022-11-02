package Generic;


public class GenericMetods {

    //generic metot :
    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
    }

    //Bu şekilde birden fazla da alabiliyor.
    public static <U, Y> void printArray2(U[] arr,Y[] arr2) {

        for (U i : arr) {
            System.out.print(i + "-");
        }
        System.out.println();
        System.out.println();

        for (Y i : arr2) {
            System.out.print(i + "-");
        }
    }

    public static void main(String[] args) {
        String[] a = {"java","102","patika","dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'j','a','v','a'};

        printArray(a);
        printArray(b);
        printArray(c);

        printArray2(a,b);

    }
}
