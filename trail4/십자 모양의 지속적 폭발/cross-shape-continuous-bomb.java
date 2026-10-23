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
        int[] bombCols = new int[m];
        for (int i = 0; i < m; i++)
            bombCols[i] = sc.nextInt() - 1;
        int dr[] = new int[] {-1, 1, 0, 0};
        int dc[] = new int[] {0, 0, -1, 1};

        for (int i = 0; i < m; i++) { //폭탄 터지는 횟수

            for (int j = 0; j < n; j++) { //폭탄 있는 행 서치
                int size = grid[j][bombCols[i]];
                if (grid[j][bombCols[i]] != 0) {
                    grid[j][bombCols[i]] = 0; //선택된 정수자리 0으로
                    for (int k = 0; k < 4; k++) { //방향 돌리기
                        int r = j;
                        int c = bombCols[i];
                        for (int f = 1; f < size; f++) { //선택된 정수만큼 터지게
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if (nr >= n || nr < 0 || nc >= n || nc < 0) break;

                            grid[nr][nc] = 0;
                            r += dr[k];
                            c += dc[k];
                        }
                    }
                    break;
                }
            }
            //0으로만들었으면 이제 떨어지게 해야함
            //행 하나하나 아래서부터 확인하면서 0인 값이 있을때
            //그 위를 아래서부터 탐색해서 0이 아닌값이 있으면 넣는 방식으로
            for (int q = 0; q < n; q++) {
                for (int w = n - 1; w >= 0; w--) {
                    if (grid[w][q] == 0) {
                        for (int check = w; check >= 0; check--) {
                            if (grid[check][q] != 0 && check != w) {
                                grid[w][q] = grid[check][q];
                                grid[check][q] = 0;
                                break;
                            }
                        }
                    }
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
