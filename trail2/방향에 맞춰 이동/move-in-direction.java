import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        int dx[] = new int[]{-1,0,0,1};
        int dc[] = new int[]{0,-1,1,0};
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            for (int j = 0; j < distance; j++) {
                if(direction=='W') {
                    x = dx[0] + x ;
                    y = dc[0] + y ;
                }if(direction=='S') {
                    x = dx[1] + x ;
                    y = dc[1] + y ;
                }if(direction=='N') {
                    x = dx[2] + x ;
                    y = dc[2] + y ;
                }if(direction=='E') {
                    x = dx[3] + x ;
                    y = dc[3] + y ;
                }
            }
        }
        System.out.println(x+" "+ y);
    }
}