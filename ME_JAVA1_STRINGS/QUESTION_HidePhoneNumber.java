public class Solution {

    static String hidePhoneNumber(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length-3; i++){
            sb.append("*");
        }
        sb.append(s.substring(length-3, length));
        return sb.toString();
    }

    public static void main(String args[]) {
        assert (hidePhoneNumber("8160651749").equals("*******749")) : "Expect \"*******749\" when s= \"8160651749\"";
        System.out.println("All test cases in main function passed");
    }
}
