import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        int dr[] = new int[] {0, -1, 0, 1};
        int dc[] = new int[] {-1, 0, 1, 0};

        int r = n - 1;
        int c = n - 1;
        // 반대로 끝부터 채워간다?
        int idx = 0;
        for (int i = n * n; i >= 1; i--) {
            int nr = r + dr[idx];
            int nc = c + dc[idx];

            arr[r][c] = i;

            if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
                idx++;
            
            }
            if (idx == 4) idx = 0;
            r = r + dr[idx];
            c = c + dc[idx];
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            } System.out.println();
        }

    }
}
