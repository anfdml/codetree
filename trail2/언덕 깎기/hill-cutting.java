import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 100; i++) {
            int R = i + 17;
            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < i) {
                    cost += (i - arr[j]) * (i - arr[j]);
                }
                if (arr[j] > R) {
                    cost += (arr[j] - R) * (arr[j] - R);
                }

            }
            min = Math.min(min, cost);
        }
        System.out.print(min);
    }
}
