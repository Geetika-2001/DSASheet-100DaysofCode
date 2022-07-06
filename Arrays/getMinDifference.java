import java.util.Arrays;

//Given heights of n towers and a value k. We need to either 
//increase or decrease the height of every tower by k (only once)
// where k > 0. The task is to minimize the difference between the heights of the longest 
//and the shortest tower after modifications and output this difference.
public class getMinDifference {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = getMindiff(arr, k);
        System.out.println(ans);
    }

    static int getMindiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int tempmin = arr[0];
        int tempmax = arr[n - 1];

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - k < 0)
                continue;

            tempmin = Math.min(arr[0] + k, arr[i] - k);
            tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
}