import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        int maxbomb = 0;
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
            maxbomb = Math.max(maxbomb, bombs[i]);
        }

        int max = 0;
        int bombcount[] = new int[maxbomb + 1];
        for (int i = 0; i < n; i++) {

            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= n) continue;
                if (j == i) continue;
                if (bombs[j] == bombs[i]) {
                    bombcount[bombs[i]]++;
                    break;
                }
            }

        }
        for (int i = 0; i < bombcount.length; i++) {
            max = Math.max(bombcount[i], max);
        }
        if (max == 0) {
            System.out.print(0);
        } else {

            for (int i = bombcount.length - 1; i >= 0; i--) {
                if (max == bombcount[i]) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}
