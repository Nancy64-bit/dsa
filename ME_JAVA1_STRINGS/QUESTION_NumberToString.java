import java.util.*;

public class Solution {

  public static String numberToString(int num) {
    return num + "";
  }


    public static void main(String args[]) {

      assert (numberToString(11).equals("11")) : "Expect \"11\" when num=11";
      System.out.println("All test cases in main function passed");

    }
}

