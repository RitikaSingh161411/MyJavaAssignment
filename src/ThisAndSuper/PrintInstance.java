package ThisAndSuper;

public class PrintInstance {
    class ParentClass {
        int field1;
        String field2;

        ParentClass(int field1, String field2) {
            this.field1 = field1;
            this.field2 = field2;
        }
    }

    class ChildClass extends ParentClass {

        ChildClass(int field1, String field2) {
            super(field1, field2);
        }

        void printFields() {
            System.out.println("Field1: " + super.field1);
            System.out.println("Field2: " + super.field2);
        }

        public static void main(String[] args) {
            PrintInstance outerInstance = new PrintInstance();
            ChildClass instance = outerInstance.new ChildClass(10, "Hello");
            instance.printFields();
        }
    }
    
}
