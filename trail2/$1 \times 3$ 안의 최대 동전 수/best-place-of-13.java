import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int max = 0;
        for(int j=0; j<n; j++){
        for(int i=0; i<n-2; i++){
            int sum = 0;
            sum = grid[j][i]+grid[j][i+1]+grid[j][i+2];
            max= Math.max(max,sum);
        }
        }
        System.out.print(max);
    }
}