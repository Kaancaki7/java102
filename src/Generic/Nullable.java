package Generic;

//generic kullandık
public class Nullable<T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void print() {
        if (isNull()) {
            System.out.println("dğişkene değer atanmamış");
        }
        else {
            System.out.println(this.getValue());
        }
    }
}
