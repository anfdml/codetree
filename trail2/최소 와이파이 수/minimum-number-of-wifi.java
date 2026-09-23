import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        int count = 0;

        while (idx < n) {
            if (arr[idx] == 0) {
                idx++;
            }
            else {
                count++;

                idx += 2 * m + 1;
            }

        }
        System.out.print(count);

    }
}
