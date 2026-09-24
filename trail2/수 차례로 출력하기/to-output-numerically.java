import java.util.Scanner;
public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        dfs(1);
        System.out.println();
        dfs2(n);
    }
    public static void dfs(int num){
        if(num==n+1){
            return;
        }
        System.out.print(num+" ");
        dfs(num+1);
        
    }
    public static void dfs2(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        dfs2(num-1);
    } 
}