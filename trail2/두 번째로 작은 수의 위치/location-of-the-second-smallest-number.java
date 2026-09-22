import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] == min) {
                arr[i] = 0;
            }
        }
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0) {
                min2 = Math.min(min2, arr[i]);
            }
        }
        int idx = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == min2) {
                idx = i + 1;
                count++;
            }
        }
        if (count == 1 && min2 != 0) {
            System.out.print(idx);
        } else {
            System.out.print(-1);
        }

    }
}
