import java.util.Arrays;
import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        // Find Union and Intersection of two unsorted arrays
        int[] arr1 = { 7, 1, 5, 2, 3, 6 };
        int[] arr2 = { 3, 8, 6, 20, 7 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            s.add(arr2[j]);
        }
        System.out.println(s);
        getIntersection(arr1, arr2);
    }

    // Using 2 pointer method
    static void getIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        HashSet<Integer> a = new HashSet<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                a.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i += 1;
            } else if (arr1[i] < arr2[j]) {
                j += 1;
            }
        }
        System.out.println(a);
    }
}
