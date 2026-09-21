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

        boolean sandwitch = true;

        if (x2 < a1) {
            sandwitch = false;
        } else if (a2 < x1) {
            sandwitch = false;
        } else if (y2 < b1) {
            sandwitch = false;
        } else if (b2 < y1) {
            sandwitch = false;
        }

        if (sandwitch) {
            System.out.print("overlapping");
        } else {
            System.out.print("nonoverlapping");
        }
    }
}
