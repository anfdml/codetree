import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[10][10];
        int Lr = 0; int Lc = 0; int Rr = 0; int Rc = 0; int Br = 0; int Bc = 0;
        for (int i = 0; i < 10; i++) {
            String temp = sc.next();
            for (int j = 0; j < 10; j++) {
                board[i][j] = temp.charAt(j);
                if (board[i][j] == 'B') {
                    Br = i; Bc = j;
                } else if (board[i][j] == 'R') {
                    Rr = i; Rc = j;
                } else if (board[i][j] == 'L') {
                    Lr = i; Lc = j;
                }
            }
        }
        int ans = 0;
        if (Br == Lr && Br == Rr && ((Bc < Rc && Lc > Rc) || (Lc < Rc && Bc > Rc))) {
            ans = Math.abs(Br - Lr) + Math.abs(Bc - Lc) + 1;
        } else if (Bc == Lc && Bc == Rc && ((Br < Rr && Lr > Rr) || (Lr < Rr && Br > Rr))) {
            ans = Math.abs(Br - Lr) + Math.abs(Bc - Lc) + 1;
        } else {
            ans = Math.abs(Br - Lr) + Math.abs(Bc - Lc) - 1;

        }

        System.out.print(ans);

    }
}
