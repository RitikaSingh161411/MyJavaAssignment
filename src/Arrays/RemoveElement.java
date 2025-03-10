package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        int[] result = removeElement(array, value);
        System.out.print("The new array is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeElement(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        int index = 0;
        for (int num : array) {
            if (num != value) {
                newArray[index] = num;
                index++;
            }
        }
        return newArray;
    }
    
}
