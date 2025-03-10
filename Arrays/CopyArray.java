package Arrays;

public class CopyArray {
    public static void copyArray(int[] source, int[] target) {
        if (source.length != target.length) {
            throw new IllegalArgumentException("Source and target arrays must have the same length");
        }
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.println("The source array: ");
        for (int num : sourceArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nThe target array: ");
        for (int num : targetArray) {
            System.out.print(num + " ");
        }
    }
    
}
