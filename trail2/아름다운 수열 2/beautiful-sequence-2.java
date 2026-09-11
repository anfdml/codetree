import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        
        int count = 0; 
        for(int i=0;i<=N-M; i++) { //a 도는거 
            boolean check[] = new boolean[M];
            for (int j = 0; j < M; j++) {//a의 i i+1 i+2 각각 확인         
                boolean found = false;
                for (int j2 = 0; j2 < M; j2++) {
                    if(B[j2]==A[i+j] && !check[j2]) {
                        check[j2]=true;
                        found = true;
                        break;
                    }
                    }
                if(!found) {
                    count++;
                    break;
                }
                
                
            }
        }
         int ans = (N-M+1)-count;
         if(N<M){
            System.out.print(0);
         }else{
        System.out.println(ans);
    }
 }
}