import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        int max = 0;
        for(int i=0; i<n;i++){
            for(int j =1; j<n-1;j++){
                int aCoin = 0;
                if(arr[i][j-1]==1) aCoin++; if(arr[i][j]==1) aCoin++; if(arr[i][j+1]==1) aCoin++;
                for(int k=0;k<n;k++){
                    for(int l=1;l<n-1;l++){
                        int bCoin = 0;
                        if(i==k && (j==l-2 || j==l+2 || j==l-1||j==l+1 || j==l)) continue;
                        else{
                            if(arr[k][l-1]==1) bCoin++; if(arr[k][l]==1) bCoin++; if(arr[k][l+1]==1) bCoin++;

                            max = Math.max(max, aCoin+bCoin);
                        }
                    }
                } 
            }
        }//for문 끝 
        System.out.print(max);
    }
}