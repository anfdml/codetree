import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) arr[i] = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                int ateam = arr[i] + arr[j];
                boolean used[] = new boolean[6];
                used[i] = true; used[j] = true;
                for (int k = 0; k < 6; k++) {
                    for (int l = k+ 1; l < 6; l++) {
                        if (!used[k] && !used[l]) {
                            used[k] = true; used[l] = true;
                            int bteam = arr[k] + arr[l];
                            int cteam = 0;
                            for (int m = 0; m < 6; m++) {
                                if (!used[m]) {
                                    cteam += arr[m];
                                }
                            }
                            int maxmin[] = new int[3];
                            maxmin[0] = ateam;
                            maxmin[1] = bteam;
                            maxmin[2] = cteam;
                            Arrays.sort(maxmin);
                            ans = Math.min(maxmin[2] - maxmin[0], ans);
                            used[k]=false; used[l]=false;
                        }
                    }
                }
            }
        }
        System.out.print(ans);

    }
}
