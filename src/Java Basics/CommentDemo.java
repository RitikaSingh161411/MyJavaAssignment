public class CommentDemo {
    // This is a single-line comment: It explains that the following line prints "Hello, World!"
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Printing to console
        
        /* 
         * This is a multi-line comment:
         * It's used to explain that the following lines
         * perform basic arithmetic operations
         */
        int a = 5; // Variable a is assigned the value 5
        int b = 3; // Variable b is assigned the value 3
        int sum = a + b; // Calculating sum
        int difference = a - b; // Calculating difference
        
        System.out.println("Sum: " + sum); // Printing sum to console
        System.out.println("Difference: " + difference); // Printing difference to console
    }
    
    /**
     * This is a documentation comment:
     * It's used to describe the method below
     * which performs a multiplication of two integers
     * 
     * @param x First integer
     * @param y Second integer
     * @return The product of x and y
     */
    public static int multiply(int x, int y) {
        return x * y; // Returning product
    }
}
