import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char arr[] = new char[10002];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[pos] = c;
        }
        int max = 0;
        for (int i = 1; i <= 10001 - k; i++) {
            int idx = i;
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                if (arr[idx] == 'G') sum = sum + 1; if (arr[idx] == 'H') sum = sum + 2;
                idx++;
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);

    }
}
