import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for (int j = 0; j < arr.length; j++) {
                int two = 0; 
                if(i != j) {
                    two += arr[i]+arr[j];
                    two=sum-two;
                    min=Math.min(min,Math.abs(two-s));
                }
            }
        }
        System.out.println(min);
    }
}