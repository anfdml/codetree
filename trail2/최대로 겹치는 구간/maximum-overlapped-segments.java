import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

        }
        
        int max = x2[0]; 
        int min = x1[0];
        for (int i = 0; i < x2.length; i++) {
            if(max<x2[i]) {
                max = x2[i];
            }
            if(min>x1[i]){
                min = x1[i];
            }
        }
        int arr[] = new int[max-min];
        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                arr[j-min]++;
            }
        }
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max1<arr[i]) {
                max1 = arr[i];
            }
        }
       
        
        System.out.print(max1);
        // Please write your code here.
        
    }
}