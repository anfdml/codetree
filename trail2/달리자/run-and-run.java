import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                int save = a[i] - b[i];
                for (int j = i; j < n; j++) {
                    int count = 0;
                    if (b[j] > a[j]) {
                        while (save > 0 && b[j] != a[j]) {
                            a[j]++;
                            save--;
                            count++;
                        }
                        ans += count * (j - i);
                    }
                }
            }
        }
        System.out.print(ans);
    }
}
