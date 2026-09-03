import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        int arr[] = new int[n+1];
        boolean nodeath = true;
        for (int i = 0; i < m; i++) {
            for (int l = 1; l < arr.length; l++) {
            if(penalizedPerson[i]==l) {
                arr[l]++;
            }
            if(arr[l]==k) {
                System.out.println(l);
                nodeath=false;
                return;
            }
            
        }
            
        }
        if(nodeath) {
            System.out.println(-1);
        }
    }
}