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

        int max = 0;
        for (int i = 0; i < n; i++) { // 배열의 시작점
            for (int j = 0; j < n; j++) { // 배열의 시작점
                for (int k = 0; k < 2 * n; k++) { // 이동할수있는 거리
                    int count = 0;
                    for (int r = 0; r < n; r++) {
                        for (int c = 0; c < n; c++) {
                            if (Math.abs(r - i) + Math.abs(c - j) <= k) {
                                if (grid[r][c] == 1) count++;
                            }
                        }
                    }
                    if (k * k + (k + 1) * (k + 1) <= m * count) {
                        max = Math.max(max, count);
                    }

                }
            }
        }
        System.out.print(max);
    }
}
