package Constructor;

public class CallCOnstruct {
    public CallCOnstruct() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        CallCOnstruct obj = new CallCOnstruct();
        System.out.println(obj.toString());
    }
    
}
