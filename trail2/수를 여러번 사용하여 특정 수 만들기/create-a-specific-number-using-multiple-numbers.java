import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = 0; C >= A * i; i++) {
            for (int j = 0; C >= B * j; j++) {
                int num = A * i + B * j;
                if (num <= C) {
                    max = Math.max(max, num);
                }
            }

        }
        System.out.print(max);
    }
}
