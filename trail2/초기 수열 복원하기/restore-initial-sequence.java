import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();

        int ans[] = new int[n];
        for (int i = 1; i <= n; i++) {
            int arr[] = new int[n];
            arr[0] = i;
            boolean[] used = new boolean[n + 1];
            boolean isok = true;
            used[i] = true;
            for (int j = 1; j < n; j++) {
                arr[j] = a[j - 1] - arr[j - 1];
                if (arr[j] < 1 || arr[j] > n || used[arr[j]]) {
                    isok = false;
                    break;
                }
                used[arr[j]] = true;
            }
            if (isok) {
                for (int j = 0; j < n; j++) {
                    ans[j] = arr[j];
                }
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
