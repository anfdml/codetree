import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        boolean isok = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else if (!stack.isEmpty() && str.charAt(i) == ')') {
                stack.pop();
            } else {
                isok = false;
            }
        }
        if (!stack.isEmpty()) isok = false;
        if (isok) System.out.print("Yes");
        else System.out.print("No");
    }
}
