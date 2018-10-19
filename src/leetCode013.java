public class leetCode013 {
    public static int romanToInt(String s) {
        int i = 1, sum = parseRoman(s.charAt(0));
        while (s.length() > i) {
            if (parseRoman(s.charAt(i - 1)) < parseRoman(s.charAt(i))) {
                sum -= 2 * parseRoman(s.charAt(i - 1)) - parseRoman(s.charAt(i));
            } else {
                sum += parseRoman(s.charAt(i));
            }
            i++;
        }
        return sum;
    }
    public static int parseRoman(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default  : return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
