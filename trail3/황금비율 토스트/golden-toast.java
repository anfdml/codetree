import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        LinkedList<Character> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            arr.add(s.charAt(i));
        }

        ListIterator<Character> it = arr.listIterator(arr.size());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char cmd = command.charAt(0);

            if (cmd == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            }
            else if (cmd == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            }
            else if (cmd == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
            else if (cmd == 'P') {
                it.add(command.charAt(2));
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }

        System.out.print(sb);
    }
}
