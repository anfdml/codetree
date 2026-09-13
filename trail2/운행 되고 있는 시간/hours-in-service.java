import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        int workTime[] = new int[1001];
        for (int i = 0; i < N; i++) {
            for (int k = A[i]; k < B[i]; k++) {
                workTime[k]++;
            }
        } int max = 0;
        for (int i = 0; i < N; i++) {
            for (int k = A[i]; k < B[i]; k++) {
                workTime[k]--;
            }
            int count = 0;
            for (int j = 0; j < workTime.length; j++) {
                if (workTime[j] != 0) count++;
            }
            for (int l = A[i]; l < B[i]; l++) {
                workTime[l]++;
            }
            max = Math.max(max, count);

        }
        System.out.print(max);
    }
}
