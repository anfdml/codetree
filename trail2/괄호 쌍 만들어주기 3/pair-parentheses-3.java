import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = str.length();
        int count = 0;
        for(int i=0; i<N;i++){
            if(str.charAt(i)=='('){
                for(int j=i+1;j<N;j++){
                    if(str.charAt(j)==')') count++;
                }
            }
        }
        System.out.print(count);
    }
}