import java.util.*;


public class Solution {


    public static String[] combineAllStrings(String[] s1, String[] s2) {
        List<String> combinedList = new ArrayList<>();
        for (String str1 : s1) {
            for (String str2 : s2) {
                combinedList.add(str1 + str2);
            }
        }
        return combinedList.toArray(new String[0]);
    }

    public static void main(String args[]) {

        String input1[] = {"a", "c", "e"};
        String input2[] = {"b", "d", "f"};
        String output[] = {"ab", "ad", "af", "cb", "cd", "cf", "eb", "ed", "ef"};
        assert Arrays.equals(combineAllStrings(input1, input2), output) : "Expect [\"ab\", \"ad\", \"af\", \"cb\", \"cd\", \"cf\", \"eb\", \"ed\", \"ef\"] for input1 = [\"a\", \"c\", \"e\"] and input2 = [\"b\", \"d\", \"f\"]";
        System.out.println("All test cases in main function passed");

    }
}

