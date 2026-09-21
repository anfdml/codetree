import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) { //기준이 되는 수
            int sum = 0;
            int temp[] = new int[n];
            for (int j = 0; j < n; j++) {
                if (arr[j] < i) {
                    temp[j] = i;
                    sum += Math.abs(i - arr[j]);
                } else if (arr[j] > i + k) {
                    temp[j] = i + k;
                    sum += Math.abs(i + k - arr[j]);
                } else {
                    temp[j] = arr[j];
                }
            }
            ans = Math.min(ans, sum);
        }
        System.out.print(ans);
    }
}
