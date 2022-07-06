import java.util.HashSet;

//if array contains only unique elements HasSet can be used
public class mergesortedarr1 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 7, 9 };
        int[] arr2 = { 2, 3, 4, 6 };

        HashSet<Integer> s = new HashSet<Integer>();

        for (int j = 0; j < arr1.length; j++) {
            s.add(arr1[j]);
        }
        for (int j = 0; j < arr2.length; j++) {
            s.add(arr2[j]);
        }
        System.out.println(s);

    }
}
