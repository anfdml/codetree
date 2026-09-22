import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int count1 = 0; int count2 = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1)) {
                count1++;
            }
            if ((a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2) || (a[i] == 1 && b[i] == 3)) {
                count2++;
            }
        }
        int ans = Math.max(count1, count2);
        System.out.print(ans);
    }
}
