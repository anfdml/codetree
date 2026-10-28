import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int dr[] = new int[] {-1, -1, 0, 1, 1, 1, 0, -1};
        int dc[] = new int[] {0, 1, 1, 1, 0, -1, -1, -1};

        for (int turn = 0; turn < m; turn++) { // m번의 턴
            for (int findnum = 1; findnum <= n * n; findnum++) { //1부터 n*n까지 찾기
                boolean find = false;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (findnum == grid[i][j]) {
                            int max = 0;
                            for (int dir = 0; dir < 8; dir++) {
                                int nr = i + dr[dir];
                                int nc = j + dc[dir];

                                if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;

                                max = Math.max(max, grid[nr][nc]);
                            }
                            for (int dir = 0; dir < 8; dir++) {
                                int nr = i + dr[dir];
                                int nc = j + dc[dir];

                                if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;

                                if (max == grid[nr][nc]) {
                                    int tmp = grid[i][j];
                                    grid[i][j] = grid[nr][nc];
                                    grid[nr][nc] = tmp;
                                    find = true;
                                    break;
                                }
                            }
                        }
                        if (find) break;
                    }
                    if (find) break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
