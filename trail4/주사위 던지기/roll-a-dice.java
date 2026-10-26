import java.util.Scanner;

public class Main {
    static int[] dr = new int[] {-1, 1, 0, 0};
    static int[] dc = new int[] {0, 0, -1, 1};
    static int n, m, r, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;
        char[] directions = new char[m];
        for (int i = 0; i < m; i++) {
            directions[i] = sc.next().charAt(0);
        }
        int arr[][] = new int[n][n];

        int dice[] = new int[] {6, 5, 4, 3, 2, 1}; // 아래 뒤 왼 오 앞 위
        arr[r][c] = dice[0];
        for (int i = 0; i < m; i++) {
            int tmp[] = new int[6];
            if (directions[i] == 'L' && check(2, r, c)) {
                r = r + dr[2];
                c = c + dc[2];
                tmp[0] = dice[2];
                tmp[1] = dice[1];
                tmp[2] = dice[5];
                tmp[3] = dice[0];
                tmp[4] = dice[4];
                tmp[5] = dice[3];
                dice = tmp;
                arr[r][c] = dice[0];
            }
            if (directions[i] == 'R' && check(3, r, c)) {
                r = r + dr[3];
                c = c + dc[3];
                tmp[0] = dice[3];
                tmp[1] = dice[1];
                tmp[2] = dice[0];
                tmp[3] = dice[5];
                tmp[4] = dice[4];
                tmp[5] = dice[2];
                dice = tmp;
                arr[r][c] = dice[0];
            }
            if (directions[i] == 'D' && check(1, r, c)) {
                r = r + dr[1];
                c = c + dc[1];
                tmp[0] = dice[4];
                tmp[1] = dice[0];
                tmp[2] = dice[2];
                tmp[3] = dice[3];
                tmp[4] = dice[5];
                tmp[5] = dice[1];
                dice = tmp;
                arr[r][c] = dice[0];
            }
            if (directions[i] == 'U' && check(0, r, c)) {
                r = r + dr[0];
                c = c + dc[0];
                tmp[0] = dice[1];
                tmp[1] = dice[5];
                tmp[2] = dice[2];
                tmp[3] = dice[3];
                tmp[4] = dice[0];
                tmp[5] = dice[4];
                dice = tmp;
                arr[r][c] = dice[0];
            }
            // 규칙을 찾아야함

        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count += arr[i][j];
            }
        }
        System.out.print(count);

    }

    public static boolean check(int num, int a, int b) {
        int nr = a + dr[num];
        int nc = b + dc[num];

        if (nr >= n || nr < 0 || nc >= n || nc < 0) return false;
        else return true;

    }
}
