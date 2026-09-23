import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int ans = 0;
        int befost = 14; // 1 5 8
        //1등이 a,b,c,ab,ac,bc,abc일때마다 숫자 변화 하면서 이전 상태랑 비교
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if (c == 'A') A = A + s;
            else if (c == 'B') B = B + s;
            else C = C + s;
            int dlfemd = Math.max(A, Math.max(B, C));
            int st = 0;
            if (A == dlfemd) {
                st += 1;
            }
            if (B == dlfemd) {
                st += 5;
            }
            if (C == dlfemd) {
                st += 8;
            }
            if (befost != st) {
                ans++;
            }
            befost = st;
        }
        System.out.print(ans);
    }
}
