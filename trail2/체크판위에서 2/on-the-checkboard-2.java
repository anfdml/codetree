import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int r = 0;
        int c = 0;
        int count =0;
        if(grid[r][c]=='W') {
            for (int i = 1; i < R-1; i++) {
                for (int j = 1; j < C-1; j++) {
                    if(grid[i][j]=='B') {
                        for (int j2 = i+1; j2 < R-1; j2++) {
                            for (int k = j+1; k < C-1; k++) {
                                if(grid[j2][k]=='W'&&grid[R-1][C-1]=='B') count++;
                            }
                        }
                    }
                }
            }
        }
        if(grid[r][c]=='B') {
            for (int i = 1; i < R-1; i++) {
                for (int j = 1; j < C-1; j++) {
                    if(grid[i][j]=='W') {
                        for (int j2 = 1+i; j2 < R-1; j2++) {
                            for (int k = 1+j; k < C-1; k++) {
                                if(grid[j2][k]=='B'&&grid[R-1][C-1]=='W') count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        
    }
}