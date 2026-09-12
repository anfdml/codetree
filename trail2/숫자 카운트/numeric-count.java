import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if(i==j || j==k || k==i) continue;
                    int back = i;
                    int ship = j ;
                    int ill = k ;
                    
                    boolean isok = true;
                    for (int l = 0; l < n; l++) {
                        int nback = num[l] / 100;
                        int nship = (num[l] / 10) % 10;
                        int nill = num[l] % 10;
                        int strike = 0;
                        int boll = 0;
                        if (back == nback) strike++; else if (back == nship || back == nill) boll++;
                        if (ship == nship) strike++; else if (ship == nback || ship == nill) boll++;
                        if (ill == nill) strike++; else if (ill == nback || ill == nship) boll++;
                        if (boll != count2[l] || strike != count1[l]) {
                            isok = false;
                            break;
                        }

                    }
                    if (isok) count++;

                }
            }
        }
        System.out.print(count);
    }
}
