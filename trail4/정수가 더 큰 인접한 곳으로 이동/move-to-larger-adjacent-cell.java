import java.util.Scanner;
public class Main {
    static int r, c, n;
    static int[][] grid;
    static int dr[] = new int[] {-1, 1, 0, 0};
    static int dc[] = new int[] {0, 0, -1, 1};
    static int value, max_c, max_r;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        grid = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print(grid[r][c] + " ");
        dir4find(r, c);

    }

    public static void dir4find(int a, int b) {
        boolean found = false;

        value = grid[a][b];
        for (int i = 0; i < 4; i++) {
            int nr = a + dr[i];
            int nc = b + dc[i];

            if ((nr >= n + 1 || nr < 1 || nc >= n + 1 || nc < 1) || grid[nr][nc] <= value) continue;

            if (value < grid[nr][nc]) {
                max_r = nr;
                max_c = nc;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.print(grid[max_r][max_c] + " ");

        } else {
            return;
        }

        dir4find(max_r, max_c);
    }
}
