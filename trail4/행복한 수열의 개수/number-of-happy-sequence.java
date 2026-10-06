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
        
        int count  =0; 
        //나오는 수가 전과 같은지 확인 같으면 count 다르면 현재까지 count 값 max 비교 
        //다르면 count 초기화후 다시 카운트하면서 max 비교 
        if(n==1){
            System.out.print(2);
            return;
        }
        for(int i=0; i < n; i++){
            int numcount = 1;
            int max=0;
            int max1 = 0;
            int numcount1 = 1;
            for(int j=1;j<n;j++){
                if(grid[i][j]==grid[i][j-1]) {
                    numcount++;
                    max = Math.max(max,numcount);
                    }
                else {
                    max = Math.max(max,numcount);
                    numcount =1;
                } 
                 if(grid[j][i]==grid[j-1][i]) {
                    numcount1++;
                    max1 = Math.max(max1,numcount1);
                    }
                else {
                    max1 = Math.max(max1,numcount1);
                    numcount1 =1;
                }
            }
            if(max >= m) count++;
            if(max1>= m) count++;
            
        }
        System.out.print(count);
    }
}