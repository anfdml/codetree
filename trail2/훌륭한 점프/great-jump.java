import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;

        for (int minVal : arr) {
            if (arr[0] > minVal || arr[n - 1] > minVal) continue;

            int prev = 0;
            boolean isok = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] <= minVal) {
                    if (i - prev > k) {
                        isok = false;
                        break;
                    }
                    prev = i;
                }
            }
            if (prev != n - 1) {
                isok = false;
            }
            if (isok) ans = Math.min(ans, minVal);
        }
        System.out.print(ans);
    }
}
