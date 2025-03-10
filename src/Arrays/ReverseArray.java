package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        int[] reversedArray = reverseArray(array);
        System.out.println("\nReversed Array: ");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    
    
}
