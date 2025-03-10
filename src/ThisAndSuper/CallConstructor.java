package ThisAndSuper;

public class CallConstructor {
    public CallConstructor() {
        this("Default");
        System.out.println("No-argument constructor called");
    }

    public CallConstructor(String message) {
        System.out.println("Constructor with argument called: " + message);
    }

    public static void main(String[] args) {
        new CallConstructor();
    }
}
