import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {

            int uptemp = top[n - 1];
            int undertemp = bottom[n - 1];
            for (int j = 1; j < n; j++) {
                top[n - j] = top[n - j - 1];
                bottom[n - j] = bottom[n - j - 1];
            }
            top[0] = undertemp;
            bottom[0] = uptemp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(top[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.print(bottom[j] + " ");
        }
    }
}
