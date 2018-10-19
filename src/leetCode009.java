public class leetCode009 {
    public static boolean isPalindrome(int x) {
        int a = x, l = 0;
        while (a >= 10) {
            a /= 10; l++;
        }
        return x >= 0 && isPalind(x, l);
    }
    private static boolean isPalind(int x, int l) {
        return x < 10 && l < 1 || x / (int) Math.pow(10, l) == x % 10 && isPalind(x % (int) Math.pow(10, l) / 10, l - 2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
