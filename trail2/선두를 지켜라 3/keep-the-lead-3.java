import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][2];
        int[][] b = new int[m][2];

        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); // 속도
            a[i][1] = sc.nextInt(); // 시간
            totalTime += a[i][1];
        }

        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt(); // 속도
            b[i][1] = sc.nextInt(); // 시간
        }
        int[] aRun = new int[totalTime + 1];
        int[] bRun = new int[totalTime + 1];
        int time = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i][1]; j++) {
                time++;
                len += a[i][0];
                aRun[time] = len;
            }
        }
        time = 0;
        len = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b[i][1]; j++) {
                time++;
                len += b[i][0];
                bRun[time] = len;
            }
        }
        int honor = 1;
        int prev;
        if (aRun[1] > bRun[1]) {
            prev = -1;
        } else if (aRun[1] < bRun[1]) {
            prev = 1;
        } else {
            prev = 0;
        }
        for (int i = 2; i <= totalTime; i++) {
            int cur;
            if (aRun[i] > bRun[i]) {
                cur = -1;
            } else if (aRun[i] < bRun[i]) {
                cur = 1;
            } else {
                cur = 0;
            }
            if (cur != prev) {
                honor++;
            }
            prev = cur;
        }
        System.out.println(honor);
    }
}
