package Static;

public class PrintStatic {
    int instanceVariable = 10;

    public static void printInstanceVariable(PrintStatic obj) {
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }

    public static void main(String[] args) {
        PrintStatic obj = new PrintStatic();
        printInstanceVariable(obj);
    }
}
