import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int k = 2; k <= 100; k += 2) {
            for (int j = 2; j<= 100; j += 2) {
                int area1 = 0;
                int area2 = 0;
                int area3 = 0;
                int area4 = 0;
                int max = 0;
                for (int i = 0; i < n; i++) {
                    if (k > x[i] && j > y[i]) area1++;
                    else if (k > x[i] && j < y[i]) area2++;
                    else if (k < x[i] && j > y[i]) area3++;
                    else if (k < x[i] && j < y[i]) area4++;
                }
                max = Math.max(max, area1);
                max = Math.max(max, area2);
                max = Math.max(max, area3);
                max = Math.max(max, area4);

                min = Math.min(min, max);
            }
        }
        System.out.print(min);
    }
}
