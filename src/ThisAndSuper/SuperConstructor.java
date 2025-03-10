package ThisAndSuper;

public class SuperConstructor {
    class Parent {
        void display() {
            System.out.println("Parent class method");
        }
    }

    class Child extends Parent {
        void display() {
            super.display();
            System.out.println("Child class method");
        }
        
        void anotherMethod() {
            this.display();
        }
    }
    
}
