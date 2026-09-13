import java.util.ConcurrentModificationException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int X = Integer.MAX_VALUE;
        int allsum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                boolean[] used = new boolean[5];
                int ateam = arr[i] + arr[j];
                used[i] = true; used[j] = true;
                for (int k = 0; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        if (!used[k] && !used[l]) {
                            int bteam = arr[k] + arr[l];
                           int  cteam = allsum - ateam - bteam;
                            if(ateam == bteam || ateam==cteam || bteam==cteam) continue;
                            max = Math.max(ateam, Math.max(bteam, cteam));
                            min = Math.min(ateam, Math.min(bteam, cteam));
                            X = Math.min(X, max - min);
                        
                        }
                    }
                }
            }
        }
        if(X==Integer.MAX_VALUE){
            System.out.print(-1);
        }else{
            System.out.print(X);
        }
    }
}
