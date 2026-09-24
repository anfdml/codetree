import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(0);
    }
    public static void dfs(int num){
        if(num==n){
            return;
        }
        System.out.println("HelloWorld");
        dfs(num+1);
    }
}