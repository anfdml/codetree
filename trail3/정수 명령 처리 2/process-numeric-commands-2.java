import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (a.equals("push")) {
                q.add(sc.nextInt());
            } else if (a.equals("pop")) {
                System.out.println(q.poll());
            } else if (a.equals("size")) {
                System.out.println(q.size());
            } else if (a.equals("empty")) {
                if (q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else {
                System.out.println(q.peek());
            }
        }
    }
}
