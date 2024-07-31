import java.util.*;

public class Solution {

    static String indexCapitalisation(String s, int[] ind) {
        StringBuilder sb = new StringBuilder(s);
        for (int i : ind) {
            if (i >= 0 && i < s.length()) {
                char ch = s.charAt(i);
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing")) : "Expect \"Learn By Doing\" for s = \"learn by doing\" and ind = [0, 6, 9]";

        System.out.println("All test cases in main function passed");

    }
}
