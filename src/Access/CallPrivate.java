package Access;

public class CallPrivate {
    class PrivateClass {
        private String name = "John Doe";
        private int age = 30;

        private void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public void accessPrivateMethod() {
            display();
        }
    }

    public static void main(String[] args) {
        CallPrivate outer = new CallPrivate();
        PrivateClass obj = outer.new PrivateClass();
        obj.accessPrivateMethod();
    }
    
}
