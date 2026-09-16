import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int interesting = 0;
        for (int i = x; i <= y; i++) {
            int len = 0;
            int count[] = new int[10];
            int num = i;
            while (num > 0) {
                count[num % 10]++;
                len++;
                num /= 10;
            } for (int j = 0; j < 10; j++) {
                if (len - 1 == count[j]) {
                    interesting++;
                    break;
                }
            }
        }
        System.out.print(interesting);
    }
}
