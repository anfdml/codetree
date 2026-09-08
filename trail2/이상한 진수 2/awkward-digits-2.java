import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int arr[] = new int[a.length()];
        for (int i = 0; i < a.length(); i++) arr[i] = a.charAt(i) - '0';
        boolean change = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                change = true;
                break;
            }
        }

        if (!change) {
            arr[arr.length - 1] = 0;
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans * 2 + arr[i];
        }
        System.out.print(ans);
    }
}
