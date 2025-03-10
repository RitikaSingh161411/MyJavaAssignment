package Arrays;

public class SpecifiedTwoElement {

    public static boolean containsSpecifiedElements(int[] array, int elem1, int elem2) {
        boolean foundElem1 = false;
        boolean foundElem2 = false;

        for (int elem : array) {
            if (elem == elem1) {
                foundElem1 = true;
            }
            if (elem == elem2) {
                foundElem2 = true;
            }
            if (foundElem1 && foundElem2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 12, 15, 23, 30};
        int elem1 = 12;
        int elem2 = 23;

        boolean result = containsSpecifiedElements(array, elem1, elem2);
        System.out.println("Array contains both " + elem1 + " and " + elem2 + ": " + result);
    }
}