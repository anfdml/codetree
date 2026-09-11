import java.util.Scanner;

public class Main {
    static int n;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            int c2 = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int l = 1; l <= n; l++) {
                        boolean k = false;
                        boolean k2 = false;
                        if (dist(a, i) <= 2 && dist(b, j) <= 2 && dist(c, l) <= 2) k=true;
                        if (dist(a2, i) <= 2 && dist(b2, j) <= 2 && dist(c2, l) <= 2) k2=true;
                        if(k||k2)
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
        static int dist(int a, int b) {
            int diff = Math.abs(a - b);
            return Math.min(diff, n - diff);
        }
    }