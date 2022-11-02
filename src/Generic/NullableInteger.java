package Generic;

public class NullableInteger {
    private final Integer value;

    public NullableInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void print() {
        if (isNull()) {
            System.out.println("değer atanmamış");
        }
        else {
            System.out.println(this.getValue());
        }
    }
}
