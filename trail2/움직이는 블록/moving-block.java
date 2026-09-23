import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            sum += blocks[i];
        }
        sum = sum / n;
        int bcount = 0;
        for (int i = 0; i < n; i++) {
            bcount += Math.abs(blocks[i] - sum);
        }
        System.out.print(bcount / 2);

    }
}
