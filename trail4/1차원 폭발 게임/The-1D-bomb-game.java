import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> bombs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bombs.add(sc.nextInt());
        }
        boolean isok = true;
        while (isok) {
            isok = false;
            if (bombs.isEmpty()) break;
            int count = 1;
            for (int i = bombs.size() - 1; i > 0; i--) {
                if (bombs.get(i) == bombs.get(i - 1)) {
                    count++;
                }
                else {

                    if (count >= m) {
                        isok = true;
                        for (int j = 0; j < count; j++) {
                            bombs.remove(i);

                        }
                    }
                    count = 1;
                }
            }
            if (count >= m) {
                isok = true;
                for (int j = 0; j < count; j++) {
                    bombs.remove(0);
                }
            }

        }
        
            System.out.println(bombs.size());
            for (int i = 0; i < bombs.size(); i++) {
                System.out.println(bombs.get(i));
            }
        
    }
}
