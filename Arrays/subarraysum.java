public class subarraysum {
    // Kadane's Algorithm Prolem
    // Largest sum contiguous Subarray
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(subarrsum(arr));
    }

    static int subarrsum(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for (int i = 0; i < arr.length; i++) {
            max_end_here = max_end_here + arr[i];
            if (max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }
            if (max_end_here < 0) {
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
}