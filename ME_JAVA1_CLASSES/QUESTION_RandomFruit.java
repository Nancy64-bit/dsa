import java.util.*;

public class Solution {

    private String fruit;
    private String[] fruits = {"apple", "banana", "orange"};

    public Solution() {
        Random rand = new Random();
        int index = rand.nextInt(fruits.length);
        this.fruit = fruits[index];
    }

    public String GetFruit() {
        return this.fruit;
    }


    public static void main(String args[]) {
        Solution obj1 = new Solution();
        System.out.println(obj1.GetFruit());
        Solution obj2 = new Solution();
        System.out.println(obj2.GetFruit());
    }
}

