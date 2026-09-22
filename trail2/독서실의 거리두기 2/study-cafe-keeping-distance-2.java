import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = seats.charAt(i) - '0';
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) continue;
            arr[i] = 1;
            int prev = -1;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int dist = 0;
                if (arr[j] == 1) {
                    if (prev == -1) {
                        prev = j;
                    } else {
                        dist = j - prev;
                        prev = j;
                        min = Math.min(min, dist);
                    }
                }

            }
            arr[i] = 0;
            max = Math.max(max, min);
        }
        System.out.print(max);
    }
}
