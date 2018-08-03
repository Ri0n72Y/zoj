// balloons
// skipped

import java.util.ArrayList;
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
        return false;
    }

    static ArrayList<ArrayList<Integer>> getFactorGroups(int num) {
        ArrayList<ArrayList<Integer>> factorList = new ArrayList<>();

        return factorList;
    }

    static ArrayList<Integer> getFactors(int num, int fac) {
        return null;
    }

    static boolean isPrime(int num) {
        if (num == 2 || num == 3) return true;
        for (int i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
