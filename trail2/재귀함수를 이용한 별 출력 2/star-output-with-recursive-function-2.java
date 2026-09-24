import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n);
    }
    public static void dfs(int num){
        if(num==0){
            return;
        }
        for(int i=0;i<num;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        dfs(num-1);
        for(int i=0;i<num;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}