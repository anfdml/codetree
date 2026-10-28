import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int dr[] = new int[] {-1, 1, 0, 0};
            int dc[] = new int[] {0, 0, 1, -1};
            int N = sc.nextInt();
            int M = sc.nextInt();
            int tmp[][] = new int[N][N];
            char dir[][] = new char[N][N];
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                char d = sc.next().charAt(0);
                dir[x][y] = d;
                tmp[x][y] = 1;
            }
            //얼마나 반복할지 for문 ? while?
            for (int K = 0; K < 2 * N; K++) {
                int arr[][] = new int[N][N];
                char nextdir[][] = new char[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (tmp[i][j] == 1) {
                            if (dir[i][j] == 'U') {
                                int nr = i + dr[0];
                                int nc = j + dc[0];
                                if (nr < 0) {
                                    arr[i][j]++;
                                    nextdir[i][j] = 'D';
                                    }
                                else {
                                    nextdir[nr][nc] = 'U';
                                    arr[nr][nc]++;

                                }
                            } else if (dir[i][j] == 'D') {
                                int nr = i + dr[1];
                                int nc = j + dc[1];
                                if (nr >= N){
                                    arr[i][j]++;
                                     nextdir[i][j] = 'U';
                                }
                                else {
                                    nextdir[nr][nc] = 'D';
                                    arr[nr][nc]++;
                                }
                            } else if (dir[i][j] == 'R') {
                                int nr = i + dr[2];
                                int nc = j + dc[2];
                                if (nc >= N){
                                    arr[i][j]++;
                                     nextdir[i][j] = 'L';
                                }
                                else {
                                    nextdir[nr][nc] = 'R';
                                    arr[nr][nc]++;
                                }
                            } else {
                                int nr = i + dr[3];
                                int nc = j + dc[3];
                                if (nc < 0){
                                    arr[i][j]++;
                                     nextdir[i][j] = 'R';
                                     }
                                else {
                                    nextdir[nr][nc] = 'L';
                                    arr[nr][nc]++;
                                }
                            }
                        }
                    }
                }
                tmp = arr;
                dir = nextdir;
                //2이상이 있는지 확인
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (tmp[i][j] >= 2) {
                            tmp[i][j] = 0;
                            dir[i][j] = '0';
                        }
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (tmp[i][j] == 1) count++;
                }
            }
            System.out.println(count);
        }
    }
}
