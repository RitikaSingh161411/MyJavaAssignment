package Arrays;

public class TestSpecificValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        boolean found = false;
        found = contains(array, value);
        if (found) {
            System.out.println(value + " is found in the array.");
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }
    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}