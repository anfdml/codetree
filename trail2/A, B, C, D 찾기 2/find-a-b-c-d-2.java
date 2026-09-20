import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];

        for (int i = 2; i < 13; i++) {
            if (arr[i] == a + b) {
                arr[i] = 0;
                break;
            }
        }
        Arrays.sort(arr);
        int c = arr[3];
        int d = arr[14] - a - b - c;
        System.out.print(a + " " + b + " " + c + " " + d);
    }
}
