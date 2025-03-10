package MethodOverloading;

public class Same {
    public void display(int a) {
        System.out.println("Method with integer parameter: " + a);
    }

    public void display(String a) {
        System.out.println("Method with string parameter: " + a);
    }

    public static void main(String[] args) {
        Same obj = new Same();
        obj.display(10);
        obj.display("Hello");
    }
    
}
