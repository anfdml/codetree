import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int dr[] = new int[] {-1, 0, 1, 0};
        int dc[] = new int[] {0, 1, 0, -1};

        int r = n / 2;
        int c = n / 2;
        int idx = 0;
        int sum = board[r][c];
        boolean K = true;
        for (int i = 0; i < t; i++) {
            int C = commands.charAt(i);

            if (C == 'L') idx--;

            else if (C == 'R') idx++;

            idx = (idx + 4) % 4;

            int nr = r + dr[idx];
            int nc = c + dc[idx];
            //범위를 벗어나는 전진은 x
            if ((nr < 0) || (nr > n - 1) || (nc < 0) || (nc > n - 1)) K = false;
            if (K && (C == 'F')) {
                r = r + dr[idx];
                c = c + dc[idx];
                sum += board[r][c];
            }
            K = true;

        }
        System.out.print(sum);
    }
}
