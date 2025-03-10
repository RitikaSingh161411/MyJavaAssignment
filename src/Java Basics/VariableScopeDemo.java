package Arrays;
public class VariableScopeDemo {
    static int myVar = 10;

    public static void main(String[] args) {
        int myVar = 20;
        
        System.out.println("Local variable myVar: " + myVar);
        System.out.println("Global variable myVar: " + VariableScopeDemo.myVar);
        printGlobalVariable();
    }

    public static void printGlobalVariable() {
        System.out.println("Global variable myVar inside another method: " + myVar);
    }
}