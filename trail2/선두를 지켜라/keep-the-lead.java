import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();//속도
            A[i][1] = sc.nextInt();//시간
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        int Ak45[] = new int[n*1000+1];
        int BMK[] = new int[m*1000+1];
        int totalLen = 0;
        int time=0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= A[i][1]; j++) {
                totalLen=totalLen+A[i][0];
                time++;
                Ak45[time]=totalLen;    
            }
        }
        totalLen = 0;
        time=0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= B[i][1]; j++) {
                totalLen=totalLen+B[i][0];
                time++;
                BMK[time]=totalLen;
            }
        }
        int ans=0;
        int tjsen[] = new int[time+1];
        for (int i = 1; i < tjsen.length; i++) {
            if(Ak45[i]>BMK[i]) {
                tjsen[i]= -1; //ak가 앞서고 있을 때 
            }else if(Ak45[i]==BMK[i]) {
                tjsen[i]=tjsen[i-1];
                
            }else {
                tjsen[i] =1; //bmk가 앞서고 있을 때
            }
        }
        for (int i = 2; i < tjsen.length; i++) {
            if(tjsen[i-1]!=0 && tjsen[i]!=tjsen[i-1]) {
                ans++;
            }
        }

        System.out.println(ans);
       
    }
}