//Time Complexity = O(n)
//Space Complexity =O(1)
public class palindrome {
    public static void main(String[] args) {

        String str = "geeks";
        int n = str.length() - 1;
        int i = 0;
        char[] st = str.toCharArray();
        if (i < n) {
            if (st[i++] != st[n--]) {
                System.out.println("Not a palindrome");
            } else
                System.out.println("is a palindrome");
        }

    }
}
