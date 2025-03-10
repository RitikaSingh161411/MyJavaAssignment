package ThisAndSuper;

public class PrintFields {
    private int field1;
    private String field2;

    public PrintFields(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void printFields() {
        System.out.println("Field1: " + this.field1);
        System.out.println("Field2: " + this.field2);
    }

    public static void main(String[] args) {
        PrintFields obj = new PrintFields(10, "Hello");
        obj.printFields();
    }
}