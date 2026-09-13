import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int max = 0;
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int k=0; k<n;k++){
                    if(i==j || j==k || k==i) continue;
                    if(x[i]==x[j]){
                        if(y[i]==y[k]){
                            int sjfqdl  = Math.abs(x[i]-x[k]) * Math.abs(y[i]-y[j]);
                            max = Math.max(max,sjfqdl);
                        }
                    }
                }
            }
        }
        System.out.print(max);
    }
}