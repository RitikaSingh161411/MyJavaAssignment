package AbstractClass;

public class CreatAbs {
    abstract class Shape {
        // Abstract method (does not have a body)
        abstract void draw();
        
        // Non-abstract method
        void display() {
            System.out.println("Displaying shape");
        }
    }
}
