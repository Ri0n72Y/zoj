import java.util.Scanner;

// zoj 1002 fire net
public class zoj1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            StringBuilder placement = new StringBuilder();
            int n = scan.nextInt();
            if (n == 0) break;

            char[][] place = new char[n][n];

            for (int i = 0; i < n + 1; i++) {
                placement.append(scan.nextLine());
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    place[i][j] = placement.charAt(i * place.length + j);
                }
            }

            System.out.println(getMostNumber(place));
        }
    }

    static int getMostNumber(char[][] place) {
        if (isFull(place)) return 0;
        int num = 16, index = 0;
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                if (place[i][j] == 'X' || place[i][j] == 'o') continue;
                int t = getNumber(i * place.length + j, place);
                if (t < num) {
                    index = i * place.length + j;
                    num = t;
                }
            }
        }
        char[][] updatedBoard = updateBoard(index, place);
        return (getMostNumber(updatedBoard) + 1);
    }

    static boolean isFull(char[][] place) {
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                if (place[i][j] == '.') return false;
            }
        }
        return true;
    }

    static int getNumber(int index, char[][] place) {
        int num = 0;
        int l = place.length;
        //right
        for (int i = index % l + 1; i < l; i++) {
            if (place[index / l][i] == 'X') break;
            num ++;
        }
        // down
        for (int i = index / l + 1; i < l; i++) {
            if (place[i][index % l] == 'X') break;
            num ++;
        }
        // left
        for (int i = index % l - 1; i >= 0; i--) {
            if (place[index / l][i] == 'X') break;
            num ++;
        }
        // up
        for (int i = index / l - 1; i >= 0; i--) {
            if (place[i][index % l] == 'X') break;
            num ++;
        }
        return num + 1;
    }

    static char[][] updateBoard (int index, char[][] place) {
        char[][] n = place;
        int l = place.length;
        //right
        for (int i = index % l; i < l; i++) {
            if (n[index / l][i] == 'X') break;
            n[index / l][i] = 'o';
        }
        // down
        for (int i = index / l; i < l; i++) {
            if (n[i][index % l] == 'X') break;
            n[i][index % l] = 'o';
        }
        // left
        for (int i = index % l; i >= 0; i--) {
            if (n[index / l][i] == 'X') break;
            n[index / l][i] = 'o';
        }
        // up
        for (int i = index / l; i >= 0; i--) {
            if (n[i][index % l] == 'X') break;
            n[i][index % l] = 'o';
        }
        return n;
    }
}
