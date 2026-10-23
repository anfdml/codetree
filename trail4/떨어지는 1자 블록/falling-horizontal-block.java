import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt() - 1;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        boolean found = false;
        for (int j = 1; j < n; j++) {
            for (int i = k; i < k + m; i++) {
                if (grid[j][i] == 1) {
                    found = true;
                    for (int l = k; l < k + m; l++) {
                        grid[j - 1][l] = 1;
                    }
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            for (int l = k; l < k + m; l++) {
                grid[n - 1][l] = 1;
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
