package Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == toFind) {
                found = true;
                System.out.println(toFind + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println(toFind + " not found");
        }
    }
    
}
