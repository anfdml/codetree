import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        char[] arr = seat.toCharArray();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '1') continue;
            arr[i] = '1';
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == '1') continue;
                arr[j] = '1';
                int prev = -1;
                int mindist = Integer.MAX_VALUE;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == '1') {
                        if (prev == -1) prev = k;
                        else {
                            int dist = k - prev;
                            mindist = Math.min(mindist, dist);
                            prev = k;
                        }
                    }
                }
                max = Math.max(max, mindist);
                arr[j] = '0';
            }
            arr[i] = '0';
        }
        System.out.print(max);
    }
}
