import java.util.Arrays;
import java.util.Scanner;

public class kthminele {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr ={3 , 6, 1 , 8 , 9};
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        sc.close();
    }
    
}
