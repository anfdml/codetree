import java.util.Scanner;

public class Main {
    static int k, n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];
        asf(0);
    }

    public static void asf(int a) {
        if (a == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            } System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr[a] = i;
            asf(a + 1);
        }
    }
}
