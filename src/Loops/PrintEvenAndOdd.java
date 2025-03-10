package Loops;

public class PrintEvenAndOdd {
    public static void main(String[] args) {
        System.out.print("Even numbers are: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

       System.out.println("Odd numbers are: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
