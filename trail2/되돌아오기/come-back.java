import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        int dr[] = {-1, 0, 0, 1};
        int dc[] = {0, -1, 1, 0};
        int x = 0;
        int y = 0;
        int countTime = 0;
        for (int i = 0; i < n; i++) {
            for(int j=0; j<dist[i];j++){
            if (dir[i] == 'W') {
                x += dr[0];
            } else if (dir[i] == 'S') {
                y += dc[1];
            } else if (dir[i] == 'N') {
                y += dc[2];
            } else {
                x += dr[3];
            }
            countTime++;
            if (x == 0 && y == 0) {
                System.out.print(countTime);
                return;
            }
        }
        }
        if (x != 0 || y != 0) {
            System.out.print(-1);
        }

    }
}
