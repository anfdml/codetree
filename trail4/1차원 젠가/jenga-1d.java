import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        int s1 = sc.nextInt() - 1;
        int e1 = sc.nextInt() - 1;
        int s2 = sc.nextInt() - 1;
        int e2 = sc.nextInt() - 1;

        for (int i = s1; i <= e1; i++) {
            blocks[i] = 0;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (blocks[i] != 0) {
                arr.add(blocks[i]);
            }
        }

        for (int i = e2; i >= s2; i--) {
            arr.remove(i);
        }
        System.out.println(arr.size());
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }

    }
}
