
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int dx[] = new int[]{0,1,0,-1};
        int dy[] = new int[]{1,0,-1,0};
        int x = 0;
        int y = 0;
        int rotate = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R') rotate=(rotate+1)%4;
            if(s.charAt(i)=='L') rotate=(rotate+3)%4;
            if(s.charAt(i)=='F') {
                x = x + dx[rotate];
                y = y + dy[rotate];
            }
        }
        System.out.println(x+" "+y);
    }
}