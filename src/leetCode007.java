public class leetCode007 {
    public static int reverse(int x) {
        int i = 0;
        int s = x > 0 ? 1 : -1;
        x = Math.abs(x);
        while (x > 0) {
            i = i * 10 + x % 10;
            x = x / 10;
        }
        return i < 0 ? 0 : i * s;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
}
