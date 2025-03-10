package Arrays;

public class InsertElement {
public static int[] insertElement(int[] arr, int element, int position) {
    if (position < 0 || position > arr.length) {
        throw new ArrayIndexOutOfBoundsException("Position out of bounds");
    }
    int[] newArr = new int[arr.length + 1];
    for (int i = 0; i < position; i++) {
        newArr[i] = arr[i];
    }
    newArr[position] = element;
    for (int i = position; i < arr.length; i++) {
        newArr[i + 1] = arr[i];
    }
    return newArr;
}
}
