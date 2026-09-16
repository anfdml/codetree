import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int[] prshi = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    prshi[j] = p[j] / 2 + s[j];
                } else {
                    prshi[j] = p[j] + s[j];
                }
            }
            Arrays.sort(prshi);
            int sum = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                sum += prshi[j];
                if (sum > b) break;
                else count++;
            }
            max = Math.max(max, count);

        }
        System.out.print(max);
    }
}
