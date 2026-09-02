import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()+100;
            y[i] = sc.nextInt()+100;
        }
        // Please write your code here.
        boolean[][] arr  = new boolean[201][201];
        for (int k = 0; k < n; k++) {
            
            for (int i = x[k]; i < 8+x[k]; i++) {
                for (int j = y[k]; j < 8+y[k]; j++) {
                    arr[i][j]=true;
                }
            }
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.print(count );
        
    }
}