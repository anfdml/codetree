import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("push_back")) {
                link.addLast(sc.nextInt());
            } else if (command.equals("push_front")) {
                link.addFirst(sc.nextInt());
            } else if (command.equals("pop_back")) {
                System.out.println(link.pollLast());
            } else if (command.equals("pop_front")) {
                System.out.println(link.pollFirst());
            } else if (command.equals("size")) {
                System.out.println(link.size());
            } else if (command.equals("empty")) {
                if (link.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (command.equals("back")) {
                System.out.println(link.peekLast());
            } else {
                System.out.println(link.peekFirst());
            }
        }
    }
}
