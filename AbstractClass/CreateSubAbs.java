package AbstractClass;

public class CreateSubAbs {
    abstract class AbstractClass {
        public void nonAbstractMethod() {
            System.out.println("This is a non-abstract method.");
        }

        public abstract void abstractMethod();
    }

    class SubClass extends AbstractClass {
        @Override
        public void abstractMethod() {
            System.out.println("This is the implementation of the abstract method.");
        }

        public void accessMethods() {
            nonAbstractMethod();
            abstractMethod();
        }
    }

    public static void main(String[] args) {
        CreateSubAbs createSubAbs = new CreateSubAbs();
        SubClass subClass = createSubAbs.new SubClass();
        subClass.accessMethods();
    }

    
}
