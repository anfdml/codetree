import java.util.Scanner;
public class Main {
    static int[] x;
    static int[] y;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        x = new int[N];
        y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int asd = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int minx = 999999;
            int miny = 999999;
            int maxx = 0;
            int maxy = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                minx = Math.min(minx, x[j]);
                miny = Math.min(miny, y[j]);
                maxx = Math.max(maxx, x[j]);
                maxy = Math.max(maxy, y[j]);
            }
            int sjfqdl = (maxx - minx) * (maxy - miny);
                if (minx == maxx || miny == maxy) sjfqdl = 0;
                asd = Math.min(asd, sjfqdl);
        }
        System.out.print(asd);
    }
}
