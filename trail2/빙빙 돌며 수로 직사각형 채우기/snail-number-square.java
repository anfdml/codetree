import java.util.Scanner;
public class Main {
    public static int c;
    public static int r;
    public static int[] dc;
    public static int[] dr;
    public static int rotate;
    public static int arr[][];
    public static int n;
    public static int m;
    public static boolean yes(int c, int r) {
        return(0<=c && c<m && 0<=r && r<n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
        
        arr = new int[n][m];
        
         dc = new int[]{1,0,-1,0};
         dr = new int[]{0,1,0,-1};
         c=0;
         r=0;
        arr[r][c]=1;
        rotate = 0;
        
        for (int i = 2; i <=n*m; i++) {
            int nc=c+dc[rotate], nr=r+dr[rotate];
            
            if(!yes(nc,nr) || arr[nr][nc] !=0) 
                rotate = (rotate+1)%4;
                
                r=r+dr[rotate]; c=c+dc[rotate];
                arr[r][c] = i;
                
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            
            
            
        }
        
        
    }