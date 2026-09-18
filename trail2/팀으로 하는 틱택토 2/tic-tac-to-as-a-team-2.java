import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();

        int arr[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            arr[0][i] = inp1.charAt(i) - '0';
        }
        for (int i = 0; i < 3; i++) {
            arr[1][i] = inp2.charAt(i) - '0';
        }
        for (int i = 0; i < 3; i++) {
            arr[2][i] = inp3.charAt(i) - '0';
        }

        boolean team[][] = new boolean[10][10];
        //가로구하기
        for (int i = 0; i < 3; i++) {
            boolean[] check = new boolean[10];
            int count = 0;
            for (int j = 0; j < 3; j++) {

                if (!check[arr[i][j]]) {
                    check[arr[i][j]] = true;
                    count++;
                }
            }
            int a = 0;
            int b = 0;
            if (count == 2) {
                for (int k = 0; k < 10; k++) {
                    if (check[k]) {
                        if (a == 0) a = k;
                        else b = k;
                    }
                }
                team[a][b] = true;

            }

        }
        //세로
        for (int i = 0; i < 3; i++) {
            boolean[] check = new boolean[10];
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (!check[arr[j][i]]) {
                    check[arr[j][i]] = true;
                    count++;
                }
            }
            int a = 0;
            int b = 0;
            if (count == 2) {
                for (int k = 0; k < 10; k++) {
                    if (check[k]) {
                        if (a == 0) a = k;
                        else b = k;
                    }
                }
                team[a][b] = true;

            }

        }
        //대각선
        boolean[] check = new boolean[10];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (!check[arr[i][i]]) {
                check[arr[i][i]] = true;
                count++;
            }
        }
        int a = 0;
        int b = 0;
        if (count == 2) {
            for (int k = 0; k < 10; k++) {
                if (check[k]) {
                    if (a == 0) a = k;
                    else b = k;
                }
            }
            team[a][b] = true;

        }
        //역대각선
        boolean[] check1 = new boolean[10];
        count = 0;
        for (int i = 0; i < 3; i++) {
            if (!check1[arr[i][2 - i]]) {
                check1[arr[i][2 - i]] = true;
                count++;
            }
        }
        int c = 0;
        int d = 0;
        if (count == 2) {
            for (int k = 0; k < 10; k++) {
                if (check1[k]) {
                    if (c == 0) c = k;
                    else d = k;
                }
            }
            team[c][d] = true;

        }

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (team[i][j]) {
                    ans++;
                }
            }
        }
        System.out.print(ans);

    }
}
