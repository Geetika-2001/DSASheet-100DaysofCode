//Time Complecity = O(n) 
//Space Complecity =O(1)
public class revString {
    public static void main(String[] args) {

        String str = "geeksforgeeks";
        int n = str.length();
        char[] st = str.toCharArray();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            char temp = st[i];
            st[i] = st[j];
            st[j] = temp;
        }
        System.out.println(st);
    }
}
