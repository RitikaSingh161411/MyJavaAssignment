package Arrays;

public class DiffLargeAndSmall {
    public static int getDifference(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 12};
        System.out.println("Difference between largest and smallest number is: " + getDifference(array));
    }
}
