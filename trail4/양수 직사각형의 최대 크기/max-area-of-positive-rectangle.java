import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                for (int k = i; k < n; k++) {
                    for (int l = j; l < m; l++) {

                        boolean isok = true;
                        for (int h = i; h <= k; h++) {
                            for (int g = j; g <= l; g++) {
                                if (grid[h][g] <= 0) {
                                    isok = false;
                                    break;
                                }
                            }
                        }
                        if (isok) max = Math.max(max, (k - i + 1) * (l - j + 1));
                    }

                }
            }

        }
        System.out.print(max);
    }
}
