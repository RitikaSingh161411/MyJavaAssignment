import java.util.*;
class Name
{
    public static void main(String args[])
    {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}