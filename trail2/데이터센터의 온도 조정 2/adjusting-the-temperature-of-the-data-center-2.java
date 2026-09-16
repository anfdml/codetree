import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        int max = 0;
        for(int temp = -1 ; temp<1002; temp++){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            
            if(temp<ta[i]) sum +=c;
            else if(temp>tb[i]) sum += h;
            else sum += g;
            

        }max = Math.max(max,sum);
        }
        System.out.print(max);
    }

}
