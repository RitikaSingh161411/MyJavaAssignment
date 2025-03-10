package String;

public class DifferentString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "HelloWorld";
        String str4 = "World";

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));

        // startsWith()
        System.out.println("startsWith: " + str3.startsWith(str1));

        // endsWith()
        System.out.println("endsWith: " + str3.endsWith(str4));

        // compareTo()
        System.out.println("compareTo: " + str1.compareTo(str2));
    }
    
}
