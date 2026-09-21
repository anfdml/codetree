import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        boolean sandwitch = true;

        for (int i = 1; i < n; i++) {
            if (x1[i - 1] > x2[i] || x2[i - 1] < x1[i]) {
                sandwitch = false;
            }
        }
        if (sandwitch) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}
