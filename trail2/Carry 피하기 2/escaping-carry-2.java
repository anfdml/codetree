import java.util.Scanner;
public class Main {
    static int n;
    static String[] arr;
    static int arr2[][];
    static boolean[] choose;
    static int max = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        arr2 = new int[n + 1][5];
        for (int i = 1; i < n + 1; i++) {
            String str = arr[i - 1];
            int idx = 4;
            for (int j = str.length() - 1; j >= 0; j--) {
                arr2[i][idx--] = str.charAt(j) - '0';
            }
        }
        choose = new boolean[n + 1];
        dfs(1, new int[] {0, 0, 0, 0, 0}, 0);

        System.out.println(max);

    }
    static void dfs(int idx, int[] sum, int count) {

        for (int i = 4; i >= 0; i--) {
            if (sum[i] >= 10) {
                return;
            }
        }
        if (count == 3) {

            int num1 = 0;
            for (int j = 0; j < 5; j++) {
                num1 = num1 * 10 + sum[j];
            }
            max = Math.max(num1, max);
            return;
        } if (idx > n) return;

        int[] temp = sum.clone();

        for (int i = 0; i < 5; i++)
            temp[i] += arr2[idx][i];

        choose[idx] = true;
        dfs(idx + 1, temp, count + 1); //더했다면
        choose[idx] = false;
        dfs(idx + 1, sum, count);

    }
}
