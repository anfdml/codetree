import java.util.Scanner;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n*1000+1];
        int[] B = new int[m*1000+1];
        
        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
        }
        int idx = 0;
        int loc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t[i]; j++) {
                if(d[i]=='L') {
                    idx++;
                    loc--;
                    A[idx]=loc;
                }else {
                    idx++;
                    loc++;
                    A[idx]= loc;
                }
            }
        }
        int Atime = idx; 
        idx=0;
        loc = 0; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < t2[i]; j++) {
                if(d2[i]=='L') {
                    idx++;
                    loc--;
                    B[idx]=loc;
                }else {
                    idx++;
                    loc++;
                    B[idx]=loc;
                }
            }
        }
        int Btime = idx;

        int len = Math.min(Atime,Btime);
        boolean match = false;
        for (int i = 1; i <= len; i++) {
            if(A[i]==B[i]) {
                System.out.print(i);
                match =true;
                break;
            }
        }if(!match) {
            System.out.print(-1);
        }
        
    }
}