package Arrays;

public class FindDuplicateValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean found = false;
        found = containsDuplicate(arr);
        if (found) {
            System.out.println("Duplicate value found in the array.");
        } else {
            System.out.println("No duplicate value found in the array.");
        }
    }
    public static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
