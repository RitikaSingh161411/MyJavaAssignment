package Loops;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
    
}
