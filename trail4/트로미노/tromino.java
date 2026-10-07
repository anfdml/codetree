import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int dr[] = new int[] {-1, 0, 1, 0};
        int dc[] = new int[] {0, 1, 0, -1};
        //배열에서 하나의 점을 정하고 그 점의 +dr +dc 를 한 값이 배열의 범위를 넘어가는지 검사 후 넣고 나머지 3방향중에 하나 정해서 더함  sum = grid[i][j]+grid[i+dr][j+dc]+grid idr idc 이걸 max 비교
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                for (int firstdir = 0; firstdir < 4; firstdir++) {
                    if (i + dr[firstdir] < 0 || j + dc[firstdir] < 0 || i + dr[firstdir] >= n || j + dc[firstdir] >= m) continue;

                    for (int secdir = 0; secdir < 4; secdir++) {
                        if (firstdir == secdir) continue;
                        if (i + dr[secdir] < 0 || i + dr[secdir] >= n || j + dc[secdir] < 0 || j + dc[secdir] >= m) continue;
                        int sum = 0;
                        sum = grid[i][j] + grid[i + dr[firstdir]][j + dc[firstdir]] + grid[i + dr[secdir]][j + dc[secdir]];
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.print(max);

    }
}
