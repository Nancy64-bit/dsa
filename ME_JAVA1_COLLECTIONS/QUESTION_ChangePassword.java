import java.util.*;

public class Solution {

    public static ArrayList<String> changePassword(ArrayList<String> list) {
        String currentPassword = list.get(0);  // get current password
        list.remove(0);  // remove current password from the beginning
        list.add(currentPassword);  // add current password to the end
        return list;
    }

    public static void main(String args[]) {
        ArrayList<String> inputList = new ArrayList<String> (Arrays.asList("Dilligrout", "Baubles", "Caput Draconis", "Pig Snout",
            "Wattlebird", "Banana Fritters"));

        ArrayList<String> changedOnce = new ArrayList<String> (Arrays.asList("Baubles",
            "Caput Draconis", "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout"));
        ArrayList<String> changedTwice = new ArrayList<String> (Arrays.asList("Caput Draconis",
            "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout", "Baubles"));

        assert changedOnce.equals(changePassword(inputList)) : "Expect [\"Baubles\", \"Caput Draconis\", \"Pig Snout\", \"Wattlebird\", \"Banana Fritters\", \"Dilligrout\"]";
        assert changedTwice.equals(changePassword(inputList)) : "Expect [\"Caput Draconis\", \"Pig Snout\", \"Wattlebird\", \"Banana Fritters\", \"Dilligrout\", \"Baubles\"]";

        System.out.println("All test cases in main function passed");
    }
}
