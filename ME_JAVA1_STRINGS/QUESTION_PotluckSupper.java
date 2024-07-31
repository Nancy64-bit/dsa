import java.util.*;

public class Solution {

    static boolean potluckSupper(String name, String dish) {
    char firstLetter = name.charAt(0);
    char lastLetter = name.charAt(name.length() - 1);
    return dish.charAt(0) == firstLetter && dish.charAt(dish.length() - 1) == lastLetter;
    }


    public static void main(String args[]) {
        String name = "jake";
        String dish = "jaffa cake";
        assert (potluckSupper(name, dish) == true) : "Expect true for name = \"jake\" and dish = \"jaffa cake\"";
        dish = "butterscotch mousse";
        assert (potluckSupper(name, dish) == false) : "Expect false for name = \"jake\" and dish = \"butterscotch mousse\"";
        System.out.println("All test cases in main function passed");

    }
}

