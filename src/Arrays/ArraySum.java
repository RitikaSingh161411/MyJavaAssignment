package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = sumOfArray(array);
        System.out.println("The sum of the array is: " + result);
    }

    public static int sumOfArray(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}