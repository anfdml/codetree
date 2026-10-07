import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        int dr[] = new int[] {-1, -1, 1, 1};
        int dc[] = new int[] {1, -1, -1, 1};
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // 시작 지점의 r c  dr dc 를 하면서 범위를 벗어나는지 확인 벗어나면 continue
        // dr dc 를 {-1,-1,1,1}{1,-1,-1,1}
        // i+dr 을 몇번할지  dr[0] 이 x번 갔으면 dr[2] 도 x번 가야하고 dr[1]이 y번 갔으면 dr[3]도 y번가야함
        //시작지점 for문 2개에  x번갈지 결정하는 for문  y번 갈지 결정 for문  그리고 dr dc를 x번 y번 진행하는 for문 4개
        //총 8개의 for문
        int max = 0;
        for (int r = 0; r < n; r++) { //시작점 r
            for (int c = 0; c < n; c++) { //시작점 c

                for (int x = 1; x <= n - 1; x++) { //dir 인덱스 0,2 이  가는 횟수

                    for (int y = 1; y <= n - 1; y++) { // dir 인덱스 1,3 이 가는 횟수
                        int sum = 0;
                        int nr = r;
                        int nc = c;
                        boolean isok = true;
                        for (int i1 = 0; i1 < x; i1++) {
                            nr += dr[0];
                            nc += dc[0];
                            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                                isok = false;
                                break;
                            }
                            sum += grid[nr][nc];

                        }
                        for (int i1 = 0; i1 < y; i1++) {
                            nr += dr[1];
                            nc += dc[1];
                            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                                isok = false;
                                break;
                            }
                            sum += grid[nr][nc];

                        }
                        for (int i1 = 0; i1 < x; i1++) {
                            nr += dr[2];
                            nc += dc[2];
                            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                                isok = false;
                                break;
                            }
                            sum += grid[nr][nc];

                        }
                        for (int i1 = 0; i1 < y; i1++) {
                            nr += dr[3];
                            nc += dc[3];
                            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                                isok = false;
                                break;
                            }
                            sum += grid[nr][nc];
                        }
                        if (isok) {
                            max = Math.max(max, sum);
                        }
                    }
                }
            }
        }
        System.out.print(max);

    }
}
