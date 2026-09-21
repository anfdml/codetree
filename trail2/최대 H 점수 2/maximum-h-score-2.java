import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        int maxarr = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            maxarr = Math.max(maxarr, a[i]);
        }
        int max = 0;
        for (int i = 0; i <= maxarr + 1; i++) {
            int count = 0;
            int lcount = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] >= i) {
                    count++;
                } else if (a[j] < i && a[j] + 1 >= i && lcount < l) {
                    count++;
                    lcount++;
                }
            }
            if (count >= i) {
                max = Math.max(max, i);
            }
        }
        System.out.print(max);

    }
}
