import java.util.Arrays;

//Given an array, cyclically rotate the array clockwise by one.
//Input:  arr[] = {1, 2, 3, 4, 5}
//Output: arr[] = {5, 1, 2, 3, 4}
public class cyclicrot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0, end = arr.length - 1;
        while (start != end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}