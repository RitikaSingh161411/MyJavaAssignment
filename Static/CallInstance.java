package Static;

public class CallInstance {
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void staticMethod() {
        CallInstance instance = new CallInstance();
        instance.instanceMethod();
    }

    public static void main(String[] args) {
        staticMethod();
    }
    
}
