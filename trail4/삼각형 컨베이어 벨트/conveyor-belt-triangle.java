import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int ltmp = l[n - 1];
            int rtmp = r[n - 1];
            int dtmp = d[n - 1];
            for (int j = 1; j < n; j++) {
                l[n - j] = l[n - j - 1];
                r[n - j] = r[n - j - 1];
                d[n - j] = d[n - j - 1];
            }
            l[0] = dtmp;
            r[0] = ltmp;
            d[0] = rtmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
