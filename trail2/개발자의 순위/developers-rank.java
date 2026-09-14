import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = 0;
                int b = 0;

                if (i < j) {
                    a = arr[0][i];
                    b = arr[0][j];
                } else continue;
                boolean isok = false;
                for (int q = 0; q < k; q++) {
                    int loc1 = 0;
                    int loc2 = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[q][l] == a) loc1 = l;
                        if (arr[q][l] == b) loc2 = l;
                    }
                    if (loc1 < loc2) {
                        isok = true;
                    } else {
                        isok = false;
                        break;
                    }
                }
                if (isok) count++;

            }
        }
        System.out.print(count);

    }
}
