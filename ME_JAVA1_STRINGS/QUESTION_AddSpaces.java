import java.util.*;

public class Solution {

    public static String addSpaces(String words[]) {
        if(words==null) return null;
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word).append(" ");
        }
        if(sb.length() > 0) {
            // Remove the last space
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String[] arr = { "Hello", "World" };
        assert addSpaces(arr).equals("Hello World") : "Expect \"Hello world\" for words = {Hello, World}";
        arr = new String[0];
        assert addSpaces(arr).equals("") : "Expect \"\" for input = [] or input = new String[0]";
        assert addSpaces(null) == null : "Expect null for input = null";
        System.out.println("All test cases in main function passed");
    }
}
