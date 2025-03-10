package Constructor;

public class DefaultCon {
    class SuperClass {
        SuperClass() {
            System.out.println("SuperClass default constructor");
        }

        SuperClass(String message) {
            System.out.println("SuperClass argument constructor: " + message);
        }
    }

    class SubClass extends SuperClass {
        SubClass() {
            super();
            System.out.println("SubClass default constructor");
        }

        SubClass(String message) {
            super(message);
            System.out.println("SubClass argument constructor: " + message);
        }
    }

    public static void main(String[] args) {
        DefaultCon defaultCon = new DefaultCon();
        defaultCon.new SubClass();
        defaultCon.new SubClass("Hello");
    }
    
}
