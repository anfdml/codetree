import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count =1; 
        int max = 1 ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]<arr[i]) {
                count++;
                if(max<count) {
                    max = count;
                }
            }else {
                if(max<count) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(max);
    }
}