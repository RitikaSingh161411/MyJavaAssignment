package MethodOverloading;

public class SameName {
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    public void display(String b) {
        System.out.println("Argument: " + b);
    }

    public static void main(String[] args) {
        SameName obj = new SameName();
        obj.display(10);
        obj.display("Hello");
    }
    
}
