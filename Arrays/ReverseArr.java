import java.util.Arrays;

public class ReverseArr {
    //Given an array (or string), the task is to reverse the array/string.
    public static void main (String[] args) {
        
        int[] arr= {1 , 2 , 3, 4 ,5 , 6};
        int n = arr.length;
        int start =0;
        int end = n-1;

        int temp;

        //swap
        while(start<end) {
            temp= arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array is:");
        System.out.println(Arrays.toString(arr));

    }
}
