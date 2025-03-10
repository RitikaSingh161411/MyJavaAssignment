package Arrays;

public class CalculateAverage {
    public static void main(String[] args) {
        double[] arr = {19.5, 25.5, 16.5, 18.5, 20.5};
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.2f", average);
    }
    
}
