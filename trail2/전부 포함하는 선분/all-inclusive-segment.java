import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int xs = Integer.MAX_VALUE;
            int xl = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                xs = Math.min(xs, x1[j]);
                xl = Math.max(xl, x2[j]);
            }
            ans = Math.min(xl - xs, ans);
        }
        System.out.print(ans);
    }
}
