import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        
        int idx[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int j2 = 0; j2 < dc.length; j2++) {
                    int nr = i+dr[j2];
                    int nc = j+dc[j2];
                    if(nr>=0 && nr<n &&nc>=0 && nc<n) {
                if(arr[nr][nc]==1) {
                    count++;
                }
            }
                }
                if(count>=3) {
                    idx[i][j]++;
                }
        }
    }int ans = 0;
        for (int i = 0; i < idx.length; i++) {
            for (int j = 0; j < idx.length; j++) {
                if(idx[i][j]==1) {
                    ans++;
                }
            }
        }System.out.println(ans);
        
        
        
        
        
    }
}