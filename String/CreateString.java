package String;

public class CreateString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        // Using character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("str3: " + str3);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        String str4 = sb.toString();
        System.out.println("str4: " + str4);

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        String str5 = sbf.toString();
        System.out.println("str5: " + str5);

        // Using String.format
        String str6 = String.format("%s", "Hello");
        System.out.println("str6: " + str6);

        // Using String.valueOf
        String str7 = String.valueOf("Hello");
        System.out.println("str7: " + str7);
    }
}
