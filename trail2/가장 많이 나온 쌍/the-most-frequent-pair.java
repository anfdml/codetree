import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        int max1 = 0;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            String key = min + "," + max;
            map.put(key, map.getOrDefault(key, 0) + 1);
            max1 = Math.max(max1, map.get(key));

        }
        System.out.print(max1);
    }
}
