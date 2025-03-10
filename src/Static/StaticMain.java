package Static;

public class StaticMain {
    public static class Example {
        // Static variables
        static int staticVar1 = 10;
        static String staticVar2 = "Hello";

        // Instance variables
        int instanceVar1 = 20;
        String instanceVar2 = "World";

        // Static methods
        public static void staticMethod1() {
            System.out.println("Static Method 1: " + staticVar1);
        }

        public static void staticMethod2() {
            System.out.println("Static Method 2: " + staticVar2);
        }

        // Instance methods
        public void instanceMethod1() {
            System.out.println("Instance Method 1: " + instanceVar1);
        }

        public void instanceMethod2() {
            System.out.println("Instance Method 2: " + instanceVar2);
        }

        // Main method
        public static void main(String[] args) {
            // Calling static methods
            staticMethod1();
            staticMethod2();

            // Creating an instance of the class
            Example example = new Example();

            // Calling instance methods
            example.instanceMethod1();
            example.instanceMethod2();
        }
    }
    
}
