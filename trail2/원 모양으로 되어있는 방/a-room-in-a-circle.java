import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++) {
            
            int sum = 0;
            
            int loc = i;
            for (int dist = 0; dist < n; dist++) {
                sum += arr[loc]*dist;
                
             loc = (loc+1)%n;
                
            }
            min=Math.min(min, sum);
        }
        System.out.println(min);
    }
}