import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+100;
            y1[i] = sc.nextInt()+100;
            x2[i] = sc.nextInt()+100;
            y2[i] = sc.nextInt()+100;
        }
        boolean [][] arr = new boolean[201][201];
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = x1[i]; j < x2[i]; j++) {
                    for (int j2 = y1[i]; j2 <y2[i];  j2++) {
                        arr[j][j2]=false;
                    }
                }
            }else if(i%2 != 0) {
                for (int j = x1[i]; j < x2[i]; j++) {
                    for (int j2 = y1[i]; j2 <y2[i];  j2++) {
                        arr[j][j2]=true;
                    }
                }
            
            }
            
        }//n회 반복하면서 홀수와 짝수 구분
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.print(count);
        
    }
}
