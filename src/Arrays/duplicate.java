package Arrays;

public class duplicate {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] newArr = removeDuplicates(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
