package BASIC;
public class Main {

    // Fields (Attributes) of the class
    String message;

    // Constructor to initialize the Main object
    public Main(String message) {
        this.message = message;
    }

    // Method (behavior) of the class
    public void printMessage() {
        System.out.println(message);
    }

    // Main method where execution starts
    public static void main(String[] args) {
        // Creating an object of the Main class
        Main myObject = new Main("Hello, this is a message from the Main class!");

        // Calling the method using the object
        myObject.printMessage();
    }
}