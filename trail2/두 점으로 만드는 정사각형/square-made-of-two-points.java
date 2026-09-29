import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int minx = Math.min(x1, Math.min(x2, Math.min(a1, a2)));
        int miny = Math.min(y1, Math.min(y2, Math.min(b1, b2)));
        int maxx = Math.max(x1, Math.max(x2, Math.max(a1, a2)));
        int maxy = Math.max(y1, Math.max(y2, Math.max(b1, b2)));

        int ans = Math.max((maxy - miny), (maxx - minx));

        System.out.print(ans * ans);
    }
}
