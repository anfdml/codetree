import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] c = new char[T];
        int[] x = new int[T];
        char[] loc = new char[1001];
        for (int i = 0; i < T; i++) {
            c[i] = sc.next().charAt(0);
            x[i] = sc.nextInt();
            loc[x[i]] = c[i];
        }
        int ans = 0;
        for (int i = a; i <= b; i++) {
            int minS = Integer.MAX_VALUE;
            int minN = Integer.MAX_VALUE;
            for (int j = 0; j < loc.length; j++) {
                if (loc[j] == 'N') {
                    minN = Math.min(minN, Math.abs(i - j));
                }
                if (loc[j] == 'S') {
                    minS = Math.min(minS, Math.abs(i - j));
                }
            }
            if (minS <= minN) ans++;
        }
        System.out.print(ans);

    }
}
