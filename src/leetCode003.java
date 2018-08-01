import java.util.ArrayList;

public class leetCode003 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        ArrayList<Character> substring = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            substring.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!substring.contains(s.charAt(j))) {
                    substring.add(s.charAt(j));
                } else {
                    break;
                }
            }

            max = Math.max(max, substring.size());
            substring.clear();
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
