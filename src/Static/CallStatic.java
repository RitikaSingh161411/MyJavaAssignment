package Static;

public class CallStatic {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void instanceMethod() {
        staticMethod();
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        CallStatic obj = new CallStatic();
        obj.instanceMethod();
    }
    
}
