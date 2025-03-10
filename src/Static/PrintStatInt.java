package Static;

public class PrintStatInt 
{
    static int staticVar = 10;
    int instanceVar = 20;

    public static void main(String[] args) {
        PrintStatInt obj = new PrintStatInt();
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
