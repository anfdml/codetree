import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int K = A.length();

        char[] alpha = new char[K];
        for (int i = 0; i < K; i++) {
            alpha[i] = A.charAt(i);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < K; i++) {

            //shift
            char tmp = alpha[K - 1];
            for (int j = K - 1; j >= 1; j--) {
                alpha[j] = alpha[j - 1];
            } alpha[0] = tmp;

             int count = 0;
            int lencount = 1;

            for (int j = 1; j < K; j++) {

                if (alpha[j] == alpha[j - 1]) {

                    lencount++;

                } else {
                    count++;
                    String L = Integer.toString(lencount);
                    count += L.length();
                    lencount = 1;
                }
            }

            count++;
            String L = Integer.toString(lencount);
            count += L.length();
            
            min = Math.min(min, count);
        }
        System.out.print(min);

    }
}
