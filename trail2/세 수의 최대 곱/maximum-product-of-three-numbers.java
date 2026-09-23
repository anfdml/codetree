import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //3개다 양수
        int A = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int B = arr[0] * arr[1] * arr[n - 1];
        int ans = Math.max(A, B);
        System.out.print(ans);
    }
}
