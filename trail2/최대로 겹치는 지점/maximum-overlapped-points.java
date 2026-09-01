import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        int max = 0; 
        for (int i = 0; i < end.length; i++) {
            if(end[i]>max) {
                max = end[i];
            }
        }
        int arr[] = new int[max+1];
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j <= end[i]; j++) {
                arr[j]++;
            }
        }
        max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {
                max= arr[i];
            }
        }
        System.out.print(max);
    }
}