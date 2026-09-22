import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pigeonstate[] = new int[11];
        boolean check[] = new boolean[11];
        int count = 0;
        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();
            if (!check[pigeon]) {
                pigeonstate[pigeon] = moveDir;
                check[pigeon] = true;
            }
            if (check[pigeon] && (pigeonstate[pigeon] != moveDir)) {
                count++;
                pigeonstate[pigeon] = moveDir;
            }
        }
        System.out.print(count);
    }
}
