import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 0;
        int B = 0;
        int Aback = 0;
        int Bback = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            Aback = A; Bback = B;
            if (c == 'A') A = A + s;
            else B = B + s;

            if ((A > B && !(Aback > Bback)) || (A < B && !(Aback < Bback)) || (A == B && Aback != Bback)) {
                count++;
            }
        }
        System.out.print(count);
    }
}
