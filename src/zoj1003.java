// balloons

import java.util.Scanner;

public class zoj1003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int higher = s.nextInt();
        int lower  = s.nextInt();

        if (higher < lower) {
            int c = lower;
            lower = higher;
            higher = c;
        }

        System.out.println(isLying(higher) ? lower : higher);
    }

    static boolean isLying(int num) {

        for (int i = 2; i < Math.min(num / 2, 100); i++) {
            if (num % i == 0) {
                return isLying(num / i);
            }
        }
        return true;
    }
}
