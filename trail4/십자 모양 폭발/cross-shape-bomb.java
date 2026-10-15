import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int dr[] = new int[] {-1, 1, 0, 0};
        int dc[] = new int[] {0, 0, -1, 1};

        if (grid[r][c] == 1) grid[r][c] = 0;
        else {
            for (int j = 0; j < 4; j++) {
                int nr = r + dr[j];
                int nc = c + dc[j];
                for (int i = 1; i < grid[r][c]; i++) {
                    if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                    grid[nr][nc] = 0;
                    nr += dr[j];
                    nc += dc[j];
                }
            }
            grid[r][c] = 0;
        } //폭탄 터진 곳들 전부 0으로 만듬
        //새로운 배열에 집어넣자
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            int K = n;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[j][i] != 0) {
                    arr[K - 1][i] = grid[j][i];
                    K--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            } System.out.println();
        }
    }
}
