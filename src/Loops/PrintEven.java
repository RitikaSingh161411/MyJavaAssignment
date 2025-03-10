package Loops;

public class PrintEven {
    public static void main(String[] args) {
        System.out.print("Even numbers are: ");
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
            
        }
    }
}
