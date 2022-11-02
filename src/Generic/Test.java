package Generic;

public class Test <t1,t2,t3>{
    private t1 obj1;
    private t2 obj2;
    private t3 obj3;

    public Test(t1 obj1,t2 obj2,t3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public t1 getObj1() {
        return obj1;
    }

    public void setObj1(t1 obj1) {
        this.obj1 = obj1;
    }

    public t2 getObj2() {
        return obj2;
    }

    public void setObj2(t2 obj2) {
        this.obj2 = obj2;
    }

    public t3 getObj3() {
        return obj3;
    }

    public void setObj3(t3 obj3) {
        this.obj3 = obj3;
    }
    public void showInfo() {
        System.out.println(this.obj1.getClass().getName());
        System.out.println(this.obj2.getClass().getName());
        System.out.println(this.obj3.getClass().getName());
    }
}
