import java.util.*;

public class Solution {

    static int typeConversion(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String args[]) {
        String s = "123";
        assert (typeConversion(s) == 123) : "Expect 123 for s = \"123\"";
        assert (typeConversion("-13") == -13) : "Expect -13 for s = \"-13\"";
        System.out.println("All test cases in main function passed");

    }
}
