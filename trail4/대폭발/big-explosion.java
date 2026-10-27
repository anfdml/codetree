import java.util.Scanner;

public class Main {
    static int tmp[][];
    static int grid[][];
    static int n, m, r, c;
    static int dr[] = new int[] {-1, 1, 0, 0};
    static int dc[] = new int[] {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;

        grid = new int[n][n];

        grid[r][c] = 1;

        for (int time = 1; time <= m; time++) {
            tmp = new int[n][n];
            tmp[r][c] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        bomb(time, i, j);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (tmp[i][j] == 1) {
                        grid[i][j] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print(count);

    }
    public static void bomb(int T, int a, int b) {
        for (int i = 0; i < 4; i++) {
            int dist = (int) Math.pow(2, T - 1);
            int nr = a + dist * dr[i];
            int nc = b + dist * dc[i];

            if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;

            tmp[nr][nc] = 1;
        }
    }
}
