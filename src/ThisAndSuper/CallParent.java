package ThisAndSuper;

// Call constructor of the parent class using super()
public class CallParent {
class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor called");
    }
}

public static void main(String[] args) {
    CallParent callParent = new CallParent();
    CallParent.Child child = callParent.new Child();
    System.out.println("Child object created: " + child);
}
    
}
