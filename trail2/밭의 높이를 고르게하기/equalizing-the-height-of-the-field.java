import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - t; i++) {
            int count = 0;
            for (int j = 0; j < t; j++) {
                    if (arr[i + j] > h) {
                        count += arr[i + j]-h;
                    } else if (arr[i + j] < h) {
                        count += h-arr[i + j];
                    }
            }
            min = Math.min(min, count);
        }
        System.out.print(min);
    }
}
