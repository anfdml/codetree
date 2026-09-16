import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int k = 0; k <= 100; k++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int i = j + 1; i < n; i++) {
                    int len = k - arr[i];
                    int len2 = arr[j] - k;

                    if (len == len2 && len != 0) count++;
                }

            }
            max = Math.max(max, count);

        }
        System.out.print(max);
    }
}
