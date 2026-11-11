import java.util.Scanner;
public class Main {
    static int n;
    static int arr[];
    static int check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        check = 0;
        asd(0);
        System.out.print(check);
    }
    public static void asd(int a) {
        if (a == n) {
            int i = 0;
            boolean isok = true; 
            while (i < n) {
                int num = arr[i];

                if (i + num > n) {
                    isok = false;
                    break;
                }
                for (int k = i; k < i+num; k++) {
                    if (arr[k] != num){
                        isok = false;
                    break;
                    }
                }
                if(!isok) break;

                i += num;
            }
            if(isok) check++;

            return;
        }

        for (int i = 1; i <= 4; i++) {
            arr[a] = i;
            asd(a + 1);
        }
    }
}
