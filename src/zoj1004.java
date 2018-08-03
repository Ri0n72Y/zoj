import java.util.Arrays;
import java.util.Scanner;

public class zoj1004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String str1 = s.nextLine();
            String str2 = s.nextLine();
            System.out.println("[");
            if (!Arrays.equals(getAllChars(str1), getAllChars(str2))) {
                System.out.println("]");
                continue;
            }

        }
    }

    static String getStack(String base) {
        return null;
    }

    static int[] getAllChars(String s) {
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 97] ++;
        }
        return c;
    }
}
