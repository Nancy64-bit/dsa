import java.util.*;

public class Solution {
    private int numberOfBeetsSold;
    private int costPricePerBeet;
    private int sellingPricePerBeet;

    public Solution(int numberOfBeetsSold, int costPricePerBeet, int sellingPricePerBeet) {
        this.numberOfBeetsSold = numberOfBeetsSold;
        this.costPricePerBeet = costPricePerBeet;
        this.sellingPricePerBeet = sellingPricePerBeet;
    }

    public int Profit() {
        return (sellingPricePerBeet - costPricePerBeet) * numberOfBeetsSold;
    }

    public static void main(String args[]) {
        Solution obj = new Solution(2, 3, 4);
        assert obj.Profit() == 2 : "Expect 2 for (2,3,4)";
        System.out.println("All test cases in main function passed");
    }
}
