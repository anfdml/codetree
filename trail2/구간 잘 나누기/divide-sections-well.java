import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        int maxEl = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
            maxEl = Math.max(maxEl, nums[i]);
        }
        for (int i = maxEl; i <= sum; i++) {
            int sect = 1;
            int sumsect = 0;
            for (int j = 0; j < n; j++) {
                if (sumsect + nums[j] <= i) {
                    sumsect += nums[j];
                } else {
                    sect++;
                    sumsect = nums[j];
                }
            }
            if (sect <= m) {
                System.out.print(i);
                break;
            }
        }

    }
}

// 1 | 2 | 3 4 5 6
//1 | 2 3 | 4 5 6   1 1 1 1 1 8
