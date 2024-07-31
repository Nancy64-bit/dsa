public class Solution {

    static String switcheroo(String s) {
    if (s == null || s.length() < 2) {
        return s;
    }
    
    char[] chars = s.toCharArray();
    int tempIndex = -1;
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == 'a') {
            if (tempIndex != -1) {
                chars[tempIndex] = 'a';
                tempIndex = -1;
            }
            chars[i] = 'b';
        } else if (chars[i] == 'b') {
            if (tempIndex != -1) {
                chars[tempIndex] = 'b';
                tempIndex = -1;
            }
            chars[i] = 'a';
        } else if (chars[i] == 'c') {
            if (tempIndex != -1) {
                chars[tempIndex] = chars[i];
                tempIndex = -1;
            }
        } else {
            if (tempIndex == -1) {
                tempIndex = i;
            }
        }
    }
    if (tempIndex != -1) {
        chars[tempIndex] = 'a';
    }
    return new String(chars);
    }


    public static void main(String args[]) {
        String s = "aabacbaa";
        assert (switcheroo(s).equals("bbabcabb")) : "Expect \"bbabcabb\" for s = \"aabacbaa\"";
        System.out.println("All test cases in main function passed");
    }
}
