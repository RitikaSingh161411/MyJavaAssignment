package Constructor;

public class ModConstruct {
    // Default constructor
    ModConstruct() {
        System.out.println("Default constructor");
    }

    // Public constructor
    public ModConstruct(int a) {
        System.out.println("Public constructor with parameter: " + a);
    }

    // Protected constructor
    protected ModConstruct(String b) {
        System.out.println("Protected constructor with parameter: " + b);
    }

    // Private constructor
    private ModConstruct(double c) {
        System.out.println("Private constructor with parameter: " + c);
    }

    // Static method to call the private constructor
    public static ModConstruct createInstance(double c) {
        return new ModConstruct(c);
    }
    
}
