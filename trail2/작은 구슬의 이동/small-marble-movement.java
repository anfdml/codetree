import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int T = sc.nextInt();
            int R = sc.nextInt();
            int C = sc.nextInt();
            String D = sc.next();
            
            int arr[][] = new int[N][N];
            int dr[] = {0,0,1,-1};
            int dc[] = {-1,1,0,0};
            char state = D.charAt(0);
            
           
            
                for (int j = 0; j < T; j++) {
                    
                    if(state=='U') {
                        if((dr[3]+R)>=1) {
                            R=R+dr[3];
                        }else if((dr[3]+R)<1) {
                            state='D';
                        }
                    }else if(state=='D') {
                        if((dr[2]+R)<=N) {
                            R=R+dr[2];
                        }else if((dr[2]+R)>N) {
                            state='U';
                        }
                    }else if(state=='R') {
                        if((dc[1]+C)<=N) {
                            C=C+dc[1];
                        }else if((dc[1]+C)>N) {
                            state='L';
                        }
                    }else{
                        if((dc[0]+C)>=1) {
                            C=C+dc[0];
                        }else if((dc[0]+C)<1) {
                            state='R';
                        }
                    }
                }
                System.out.println(R+" "+C);
            }

        }