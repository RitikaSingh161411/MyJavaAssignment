package String;

public class Matching {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String regex = ".*World.*";
        
        boolean matches = str.matches(regex);
        
        System.out.println("Does the string match the regular expression? " + matches);
    }
    
}
