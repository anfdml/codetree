import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean can = false;
        outer:
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <=10; k++) {
                    for (int d1 = 0; d1 < 2; d1++) {
                        for (int d2 = 0; d2 < 2; d2++) {
                            for (int d3 = 0; d3 < 2; d3++) {
                                boolean[] used = new boolean[n];
                                for (int l = 0; l < n; l++) {
                                    if ((d1 == 1) && x[l] == i || (d1 == 0) && y[l] == i
                                        || (d2 == 1) && x[l] == j || (d2 == 0) && y[l] == j
                                        || (d3 == 1) && x[l] == k || (d3 == 0) && y[l] == k) {
                                            used[l] = true;
                                        }
                                }
                                boolean isok = true;
                                for (int l = 0; l < n; l++) {
                                    if (!used[l]) {
                                        isok = false;
                                        break;
                                    }
                                }
                                if (isok) {
                                    can = true;
                                    break outer;
                                }
                            }
                        }
                    }

                }
            }
        }
        if (can) System.out.print(1);
        if (!can) System.out.print(0);
    }
}
