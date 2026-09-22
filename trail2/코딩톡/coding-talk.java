import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[M];
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        boolean[] read = new boolean[N];
        int start = 0;
        for (int i = 0; i < M; i++) {
            if (u[p - 1] == u[i]) {
                start = i;
                break;
            }
        }
        for (int i = start; i < M; i++) {
            read[c[i] - 'A'] = true;
        }
        boolean isok = true;
        for (int i = 0; i < N; i++) {
            if (!read[i]) {
                isok = false;
            }
        }
        if (isok || u[start] == 0) {
            System.out.println();
        } else if (!isok) {
            for (int i = 0; i < N; i++) {
                if (!read[i]) {
                    System.out.print((char)(i + 'A') + " ");
                }
            }
        }
    }
}
