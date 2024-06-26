import java.util.Arrays;

public class longestcommonprefix1 {
    public String longestCommonPrefix(String[] a) {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size - 1].length());

        /*
         * find the common prefix between the first and
         * last string
         */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
        {
            i++;
        }

        String pre = a[0].substring(0, i);
        return pre;
    }

    /* Driver Function to test other function */
    public static void main(String[] args) {
        longestcommonprefix1 gfg = new longestcommonprefix1();
        String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println("The longest Common Prefix is : " +gfg.longestCommonPrefix(input));
    }
}