import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        Arrays.sort(shakes, (a,b) -> Integer.compare(a[0], b[0]));
        int[] man = new int[N+1];//사람 감염 여부 
        man[P] = 1; 
        int inf[] = new int[N+1];//사람 별 감염 횟수
        inf[P] =K;
        for (int i = 0; i < T; i++) {
            if(inf[shakes[i][1]]>0 &&(man[shakes[i][1]]==1 && man[shakes[i][2]]==0)) {
                man[shakes[i][2]]=1;
                inf[shakes[i][2]]=K;
                inf[shakes[i][1]]--;
                
            }else if(inf[shakes[i][2]]>0 &&man[shakes[i][2]]==1 && man[shakes[i][1]]==0) {
                man[shakes[i][1]]=1;
                inf[shakes[i][1]]=K;
                inf[shakes[i][2]]--;
            }else if(man[shakes[i][1]]==1 && man[shakes[i][2]]==1) {
                if(inf[shakes[i][1]]>0) {
                inf[shakes[i][1]]--;
                }
                if(inf[shakes[i][2]]>0) {
                inf[shakes[i][2]]--;
                }
            }
        }
        for (int i = 1; i <= N; i++) {    
        System.out.print(man[i]);
        }
    }
}