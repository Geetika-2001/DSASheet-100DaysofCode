//Write an efficient program to print all the duplicates and their counts in the input string 
public class duplicates {
    public static void main(String[] args) {
        String str = "geeks";
        char[] s = str.toCharArray();
        int count = 0;
        for (int i = 0, j = i + 1; i < s.length && j < s.length - 1; i++) {
            if (s[i] == s[j]) {
                System.out.println(s[i]);
                count++;
            }

        }
        System.out.println(count);
    }
}
