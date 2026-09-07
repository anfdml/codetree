import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        
        int r = 0;
        int c = 0; 
        int dirsum = 0;
        int timsum = 0;
        int dr[] = new int[] {0,1,0,-1};
        int dc[] = new int[] {1,0,-1,0};
        
        for (int i = 0; i < commands.length(); i++) {
            char a= commands.charAt(i);
            
            if(a=='L') {
                if(dirsum==0) dirsum =3;
                else dirsum--;
            }else if(a=='R') {
                if(dirsum==3) dirsum =0;
                else dirsum++;
            }else {
                r = r+dr[dirsum];
                c = c+dc[dirsum];
            }
            timsum++;
            
            if(r==0 && c==0) {
                System.out.println(timsum);
                break;
            }
        }
        if(r!=0 || c!= 0) {
            System.out.println(-1);
        }
        
    }
}