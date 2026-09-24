import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        
        System.out.print(dfs(1,0));
        }
    public static int dfs(int num,int sum){
        if(num==n){
            return sum+num;  
        }
        
       return dfs(num+1, sum+num);
    }
}