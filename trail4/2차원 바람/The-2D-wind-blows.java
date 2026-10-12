import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] building = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                building[i][j] = sc.nextInt();
            }
        }
        int[][] queries = new int[q][4];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 4; j++) {
                queries[i][j] = sc.nextInt() - 1;
            }
        }
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        for (int i = 0; i < q; i++) {

            int r1 = queries[i][0];
            int c1 = queries[i][1];
            int r2 = queries[i][2];
            int c2 = queries[i][3];

            int temp = building[r1][c1];

            for (int r = r1; r < r2; r++) {
                building[r][c1] = building[r + 1][c1];
            }
            for (int c = c1; c < c2; c++) {
                building[r2][c] = building[r2][c + 1];
            }
            for (int r = r2; r > r1; r--) {
                building[r][c2] = building[r - 1][c2];
            }
            for (int c = c2; c > c1 + 1; c--) {
                building[r1][c] = building[r1][c - 1];
            }
            building[r1][c1 + 1] = temp;

            int[][] next = new int[n][m];
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    next[r][c] = building[r][c];
                }
            }
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    int count = 1;
                    int sum = building[r][c];
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];
                        if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                            continue;
                        }
                        sum += building[nr][nc];
                        count++;
                    }
                    next[r][c] = sum / count;
                }
            }
            building = next;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(building[i][j] + " ");
            }
            System.out.println();
        }
    }
}
