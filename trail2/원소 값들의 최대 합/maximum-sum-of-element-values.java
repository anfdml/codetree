import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int idx = i;
            int sum = 0;
            for (int j = 0; j < m; j++) {
                // 시작위치는 idx 값은 sum에 더하고 idx 를 arr[idx]로 변경 그걸 m번 반복한다
                sum += arr[idx];
                idx = arr[idx];
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}
