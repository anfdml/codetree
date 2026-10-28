import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] marbles = new int[m][2];
        int loc[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt() - 1;
            marbles[i][1] = sc.nextInt() - 1;
            loc[marbles[i][0]][marbles[i][1]] = 1;
        }
        int dr[] = new int[] {-1, 1, 0, 0};
        int dc[] = new int[] {0, 0, -1, 1};

        for (int time = 0; time < t; time++) {
            int tmp[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (loc[i][j] == 1) {
                        int max = 0;
                        for (int dir = 0; dir < 4; dir++) {
                            int nr = i + dr[dir];
                            int nc = j + dc[dir];
                            if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;

                            max = Math.max(max, grid[nr][nc]);
                        }
                        for (int dir = 0; dir < 4; dir++) {
                            int nr = i + dr[dir];
                            int nc = j + dc[dir];
                            if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                            if (max == grid[nr][nc]) {
                                tmp[nr][nc]++;
                                break;
                            }
                        }
                    }

                }
            }
            loc = tmp;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (loc[i][j] >= 2) {
                        loc[i][j] = 0;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (loc[i][j] == 1) count++;
            }
        }
        System.out.print(count);
    }
}
