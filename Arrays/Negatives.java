import java.util.Arrays;

public class Negatives{
    public static void main(String[] args) {
        //Move all negative numbers to beginning and positive to end with constant extra spaCE
        int [] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n= arr.length;
        {
            int j = 0, temp;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    if (i != j) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
        }
      System.out.println(Arrays.toString(arr));
    }
}