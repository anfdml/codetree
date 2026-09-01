import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N*20+1];
        int idx = N*10;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            for (int j = 0; j < x; j++) {
            
            if(dir=='R') {
                arr[idx]++;
                idx++;
                }
            else if(dir=='L') {
                idx--;
                arr[idx]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=2) {
                count++;
            }
        }
        System.out.print(count);
    }
}