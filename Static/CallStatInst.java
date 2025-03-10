package Static;

public class CallStatInst {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Calling static method
        staticMethod();
        
        // Calling instance method
        CallStatInst obj = new CallStatInst();
        obj.instanceMethod();
    }
    
}
