import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            d.addLast(i);
        }
        while (d.size() != 1) {
            d.removeFirst();
            d.addLast(d.pollFirst());
        }
        System.out.print(d.peek());
    }
}
