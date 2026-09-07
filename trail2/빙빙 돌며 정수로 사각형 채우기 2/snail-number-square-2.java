import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];
        
        int dr[] = new int[] {1,0,-1,0};
        int dc[] = new int[] {0,1,0,-1};
        
        int r = 0;
        int c = 0;
        int dir =0;
        
            
                for (int i = 1; i <= n*m; i++) {
                
                        arr[r][c]=i;
                        
                        int nr =r + dr[dir];
                        int nc = c + dc[dir];
                        if(nr<0 || nr>=n || nc<0 || nc>=m || arr[nr][nc]!=0) {
                            dir++;
                        }
                        
                        if(dir>3) dir=0;
                        
                        r = r + dr[dir];
                        c = c + dc[dir];
                        
                        
                        
                    
                
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        
    }
}