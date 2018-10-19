public class leetCode012 {
    public static String intToRoman(int num) {
        int m = num;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m / 1000; i++) {
            stringBuilder.append('M');
        }
        m %= 1000;
        if (m >= 900) {
            stringBuilder.append("CM");
            m %= 100;
        } else if (m < 500 && m >= 400 ) {
            stringBuilder.append("CD");
            m %= 100;
        } else if (m >= 500) {
            stringBuilder.append("D");
            m -= 500;
        }
        for (int i = 0; i < m / 100; i++) {
            stringBuilder.append('C');
        }
        m %= 100;

        if (m >= 90) {
            stringBuilder.append("XC");
            m %= 10;
        } else if (m < 50 && m >= 40 ) {
            stringBuilder.append("XL");
            m %= 10;
        } else if (m >= 50) {
            stringBuilder.append("L");
            m -= 50;
        }
        for (int i = 0; i < m / 10; i++) {
            stringBuilder.append('X');
        }
        m %= 10;

        if (m >= 9) {
            stringBuilder.append("IX");
            m = 0;
        } else if (m == 4 ) {
            stringBuilder.append("IV");
            m = 0;
        } else if (m >= 5) {
            stringBuilder.append("V");
            m -= 5;
        }
        for (int i = 0; i < m; i++) {
            stringBuilder.append('I');
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
