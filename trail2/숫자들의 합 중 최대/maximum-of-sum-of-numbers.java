import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = 0;
        for (int i = x; i <= y; i++) {
            int d10000 = (i / 10000) % 10;
            int d1000 = (i / 1000) % 10;
            int d100 = (i/100) % 10;
            int d10 = (i / 10) % 10;
            int d1 = i % 10;

            int sum = d10000 + d1000 + d100 + d10 + d1;

            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}
