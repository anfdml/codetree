import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        
        for (int k = 0; k < n; k++) {
                boolean isok = true;
            for (int i = 0; i < n; i++) {
                if(i==k)continue;
                for (int j = 0; j < n; j++) {
                    if(j==k) continue;
                    if ((x1[j] > x2[i] || x2[j] < x1[i])) {
                        isok = false;
                        break;
                    
                    }
                }
                if (!isok) {
                    break;
                }
            }
            if(isok){
                System.out.print("Yes");
                return;
            }

        }
        System.out.print("No");

    }
}
