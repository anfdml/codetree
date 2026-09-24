import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n);
    }
    public static void dfs(int num){
        if(num<=0){
            return;
        }
        System.out.print(num+" ");
        dfs(num-1);
        System.out.print(num+" ");
    }
}