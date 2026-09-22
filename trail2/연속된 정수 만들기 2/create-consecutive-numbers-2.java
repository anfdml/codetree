import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);

        //abs a-b b-c 비교  1보다 큰 적은쪽으로 a or c 이동

        int left = Math.abs(arr[0] - arr[1]);
        int right = Math.abs(arr[1] - arr[2]);

        int ans = 0;
        if (left == 1 && right == 1) {
            ans = 0;
        } else if (left == 2 || right == 2) {
            ans = 1;
        } else {
            ans = 2;
        }
        System.out.print(ans);
    }
}
