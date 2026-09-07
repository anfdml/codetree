import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
         int count = 0; 
         
         int dr[] = new int[] {1,0,-1,0};
         int dc[] = new int[] {0,1,0,-1};
         
         
         int arr[][] = new int[n][n];
         
         for (int i = 0; i < m; i++) {
             int r = points[i][0]-1;
             int c = points[i][1]-1;
             arr[r][c] =1;  //색칠
             for (int j = 0; j < 4; j++) {
                if(        (r+dr[j]>=0)&&(r+dr[j]<n) &&
                        (c+dc[j]>=0 )&& (c+dc[j]<n) &&
                        (arr[r+dr[j]][c+dc[j]]==1)) {
                    count++;
                }
            }
             if(count==3) {
                 System.out.println(1);
             }else {
                 System.out.println(0);
             }
             count = 0;
             
             
        }
       
        
    }
}
