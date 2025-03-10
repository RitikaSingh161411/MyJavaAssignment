package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        int n = arr.length;
        Arrays.sort(arr);
        
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
}