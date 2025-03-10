class Calculate {
    public int add(int a, int b) {
        return a + b; 
    }
    public int subtract(int a, int b) {
        return a - b; 
    }
}

public class code1 {
    public static void main(String[] args) {
        Calculate calc = new Calculate();

        // Call the add method
        int sum = calc.add(5, 3);
        System.out.println("Sum: " + sum); // Output: Sum: 8

        // Call the subtract method
        int difference = calc.subtract(5, 3);
        System.out.println("Difference: " + difference); // Output: Difference: 2
    }
}