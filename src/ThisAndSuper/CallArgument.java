package ThisAndSuper;

public class CallArgument {
    private int value;

    public CallArgument() {
        this(0); // Calling the parameterized constructor with default value
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CallArgument(int value) {
        this.value = value;
    }
}
