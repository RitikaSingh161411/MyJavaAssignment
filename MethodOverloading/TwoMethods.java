package MethodOverloading;

public class TwoMethods {
    public void display(int a) {
        System.out.println("Single parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        TwoMethods obj = new TwoMethods();
        obj.display(5);
        obj.display(10, 20);
    }
    
}
