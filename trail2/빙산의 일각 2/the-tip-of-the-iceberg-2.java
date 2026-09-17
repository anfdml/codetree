import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < 1000; i++) { //해수면의 높이
            for (int j = 0; j < n; j++) { // 배열 탐색하면서 해수면보다 낮은값은 0으로
                if (h[j] <= i) h[j] = 0;
            }
            int count = 0;
            for (int k = 0; k < n; k++) {
                if ((h[k] != 0) // 앞에 빙산이 있고 뒤가 0일 경우
                    && (k == 0 || h[k - 1] == 0)) // 앞이 0이고 뒤의 인덱스가 끝값일경우
                    count++;

            } max = Math.max(max, count);

        }
        System.out.print(max);

        //해수면의 높이를 for 0 부터 1000까지로 해수면보다 낮은 빙산은 값을 0으로 만듬
        //j-1이 0이 아닐 때 j가 0이거나 j-1이 0이아니면서 j가 인덱스 끝이면 빙산으로 간주
        //그렇게 빙산의 개수를 카운트에 저장 후 max 와 비교
    }
}
