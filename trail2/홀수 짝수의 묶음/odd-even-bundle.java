import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        int even = 0;
        int odd = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) even++;
            else odd++;
        }
        while (odd > even) {
            odd -= 2;
            even++;
        }
        if (even > odd + 1) {
            while (even > odd + 1) {
                even--;
            }
        }
        System.out.print(even + odd);
    }
}
