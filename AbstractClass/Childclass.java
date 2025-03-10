package AbstractClass;

public class Childclass extends ParentClass
{
    public static void main(String[] args) {
        Childclass child = new Childclass();
        child.abstractMethod1();
        child.abstractMethod2();
    }
    @Override
    void abstractMethod1() {
        // Implementation of abstractMethod1
    }

    @Override
    void abstractMethod2() {
        // Implementation of abstractMethod2
    }
}
