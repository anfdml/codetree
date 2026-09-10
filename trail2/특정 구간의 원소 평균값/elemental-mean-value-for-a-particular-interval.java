import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if(i>k)continue;
                int l = i;
                int r = k;
                int sum = 0;

                for (int j = l; j <= r; j++) {
                    sum += arr[j];
                }
                for (int a = l; a <= r; a++) {
                double avg = (double)sum / (r - l + 1);
                    if (avg == arr[a]) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}
