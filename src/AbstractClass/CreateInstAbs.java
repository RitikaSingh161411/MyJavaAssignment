package AbstractClass;

public class CreateInstAbs {
    abstract class Parent {
        public void nonAbstractMethod() {
            System.out.println("This is a non-abstract method in the parent class.");
        }
        
        public abstract void abstractMethod();
    }

    class Child extends Parent {
        @Override
        public void abstractMethod() {
            System.out.println("This is the implementation of the abstract method in the child class.");
        }
        
        public void createInstanceAndCallMethods() {
            Child childInstance = new Child();
            childInstance.nonAbstractMethod();
            childInstance.abstractMethod();
        }
    }

    public static void main(String[] args) {
        CreateInstAbs createInstAbs = new CreateInstAbs();
        Child child = createInstAbs.new Child();
        child.createInstanceAndCallMethods();
    }
    
}
