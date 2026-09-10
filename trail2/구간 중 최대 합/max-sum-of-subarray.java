import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i <= n-k; i++) {
            int idx =i;
            int a =0;
            for(int j=0;j<k;j++) {
            a += arr[idx];
            idx++;
            }
            max = Math.max(max, a);
        }
        System.out.println(max);
    }
}