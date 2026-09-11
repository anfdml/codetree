import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        int arr[] = new int[401];

        for(int i=0; i<n;i++){
            arr[positions[i]]+=candies[i];
        }
        int max = 0;
        for(int i=k;i<arr.length-k;i++){
            int sum =0; 
            for(int j = i-k; j<=i+k; j++){
                sum+=arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.print(max);


    }
}