import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += ability[i];
        } //전체 개발자 능력값
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    int sum1 = 0;
                    int sum2 = 0;
                    if (i != j && j != k && k != i) {
                        sum1 = ability[i] + ability[j] + ability[k];
                    } sum2 = sum - sum1;
                    min = Math.min(min, Math.abs(sum2 - sum1));
                }
            }
        }
        System.out.print(min);
    }
}
