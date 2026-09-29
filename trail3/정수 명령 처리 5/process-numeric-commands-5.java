import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String A = sc.next();

            if (A.equals("push_back")) {
                arr.add(sc.nextInt());
            }
            else if (A.equals("pop_back")) {

                arr.remove(arr.size() - 1);
            }
            else if (A.equals("get")) {
                System.out.println(arr.get(sc.nextInt() - 1));
            } else {
                System.out.println(arr.size());
            }
        }
    }
}
