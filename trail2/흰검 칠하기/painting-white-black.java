import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }
        int idx = 100*n;
        char arr[][] = new char[3][200*n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x[i]; j++) {
            if(dir[i]=='R') {
                arr[0][idx]++ ;
                arr[2][idx]= 'b';
                if(j!=x[i]-1) {
                    idx++;
                    
                }
                
                }else if(dir[i]=='L') {
                arr[1][idx]++ ;
                arr[2][idx]= 'w';
                if(j!=x[i]-1) {
                    idx--;
                    
                }
                    }
            }
        }
        int gcount = 0;
        int bcount = 0; 
        int wcount = 0;
        for (int i = 0; i < 200*n+1; i++) {
            if(arr[0][i]>=2&&arr[1][i]>=2) {
                arr[2][i] = 'g';
                 gcount++;
            }else if(arr[2][i]=='w') {
                wcount++;
            }else if(arr[2][i]=='b') {
                bcount++;
            }
        }
        System.out.print(wcount+" "+bcount+" "+gcount);
        
    }
}