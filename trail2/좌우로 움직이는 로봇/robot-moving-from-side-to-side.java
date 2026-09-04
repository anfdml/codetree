import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int at[]= new int[2000001]; //a의 걸린 기산 
        int bt[]= new int[2000001]; //b의 걸린 시간 
        char ad[]= new char[n];  // a의 이동 방향 
        char bd[]= new char[m];  //b의 이동방향 
        int totaldis[][]= new int[2000001][2]; //행의 인덱스는 1초당 이동 거리 //열은 0 : a,  1: b 
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            at[i]=t;
            ad[i]=d;
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            bt[i]=t;
            bd[i]=d;
        }
        int idx=1; // 시간별 이동거리를 totaldis에 저장하기위한 시간 누계  
        int roc = 0; //위치 
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < at[i]; j++) {
                if(ad[i]=='L') {
                    
                    totaldis[idx][0]= (roc-1);
                    roc--;
                }else {
                    
                    totaldis[idx][0]=(roc+1);
                    roc++;
                }
                idx++;
            }
        }
        int AlastLoc = roc;
        int AcountTime = idx;
        idx=  1; // 시간별 이동거리를 totaldis에 저장하기위한 시간 누계  
        roc = 0; //위치 
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < bt[i]; j++) {
                if(bd[i]=='L') {
                    
                    totaldis[idx][1]= (roc-1);
                    roc--;
                    idx++;
                }else {
                    
                    totaldis[idx][1]= (roc+1);
                    roc++;
                    idx++;
                }
            }
        }
        int BLastLoc= roc;
        int BcountTime=idx;
        int K=Math.max(AcountTime, BcountTime);
        
        for (int i = 1+AcountTime; i <= K; i++) {
            totaldis[i][0]=AlastLoc;
        }
        for (int i = 1+BcountTime; i <= K; i++) {
            totaldis[i][1]=BLastLoc;
        }
        
        
        int ans =0;
        for (int i = 1; i <= K; i++) {
            if(totaldis[i][0]==totaldis[i][1]) {
                if(totaldis[i-1][0]>totaldis[i-1][1]) {
                    ans++;
                }else if(totaldis[i-1][0]<totaldis[i-1][1]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        
        
    }
}