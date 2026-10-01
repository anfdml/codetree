import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (a.equals("push")) {
                stack.add(sc.nextInt());
            } else if (a.equals("pop")) {
                System.out.println(stack.pop());
            } else if (a.equals("size")) {
                System.out.println(stack.size());
            } else if (a.equals("empty")) {
                if (stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}
