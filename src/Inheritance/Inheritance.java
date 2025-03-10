package Inheritance;

class A {
    int data = 10;

    public void methodA1() {
        System.out.println("Method A1 from class A");
    }

    public void methodA2() {
        System.out.println("Method A2 from class A");
    }

    public void commonMethod() {
        System.out.println("Common method from class A");
    }
}

class B extends A {
    int data = 20;

    public void methodB1() {
        System.out.println("Method B1 from class B");
    }

    public void methodB2() {
        System.out.println("Method B2 from class B");
    }

    @Override
    public void commonMethod() {
        System.out.println("Common method from class B");
    }
}

class C extends B {
    int data = 30;

    public void methodC1() {
        System.out.println("Method C1 from class C");
    }

    public void methodC2() {
        System.out.println("Method C2 from class C");
    }

    @Override
    public void commonMethod() {
        System.out.println("Common method from class C");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods of each class using its own object
        objA.methodA1();
        objA.methodA2();
        objA.commonMethod();

        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.commonMethod();

        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.commonMethod();

        // Calling overridden method with superclass reference
        A refB = new B();
        A refC = new C();

        refB.commonMethod();
        refC.commonMethod();

        // Runtime Polymorphism with Data Members/Instance variables
        System.out.println("Data member of A: " + objA.data);
        System.out.println("Data member of B: " + objB.data);
        System.out.println("Data member of C: " + objC.data);

        System.out.println("Data member of B with superclass reference: " + refB.data);
        System.out.println("Data member of C with superclass reference: " + refC.data);
    }
}