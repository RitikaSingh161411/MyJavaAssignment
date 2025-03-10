package Constructor;

public class Defaultconstruct {
    public Defaultconstruct() {
        System.out.println("Default constructor called");
    }

    public Defaultconstruct(int a) {
        System.out.println("One argument constructor called with value: " + a);
    }

    public Defaultconstruct(int a, int b) {
        System.out.println("Two argument constructor called with values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        Defaultconstruct obj1 = new Defaultconstruct();
        System.out.println(obj1);
        Defaultconstruct obj2 = new Defaultconstruct(10);
        System.out.println(obj2);
        Defaultconstruct obj3 = new Defaultconstruct(20, 30);
        System.out.println(obj3);
    }
    
}
