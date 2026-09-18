import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String seat = sc.next();
        for (int i = 0; i < n; i++) {
            arr[i] = seat.charAt(i) - '0';
        }
        int max = 0;
        for (int i = 0; i < n; i++) { // 의자를 놓을 위치
            if (arr[i] == 1) continue;
            else arr[i] = 1;

            int count = 0;
            int prev = -1; //사람 인덱스
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) { //  배열 탐색하면서 거리 값 최대인거 구하기
                if (arr[j] == 1) {
                    if (prev != -1) {
                        int dist = j - prev;
                        min = Math.min(min, dist);

                    }
                    prev = j;
                }

            }
            arr[i] = 0;
            max = Math.max(max, min);
        }
        System.out.print(max);
    }
}
