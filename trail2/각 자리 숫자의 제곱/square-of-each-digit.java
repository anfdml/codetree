import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(dfs(n,0));
    }
    public static int dfs(int num,int sum){
        if(num<=0){
            return sum;
        }
        return dfs(num/10,sum+((num%10)*(num%10)));
    }
}