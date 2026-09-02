import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[200*n +1];
        int idx = 100*n;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            for (int j = 0; j < x; j++) {
                if(d=='L') {
                    arr[idx]='w';
                    if(j!=(x-1)) {
                        idx--;
                    }
                    
                }else if(d=='R') {
                    arr[idx]='b';
                    if(j!=(x-1)) {
                        idx++;
                    }
                }
                
            }
        }
        int wcount = 0;
        int bcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='b') {
                bcount++;
            }else if (arr[i]=='w') {
                wcount++;
            }
        }
        System.out.print(wcount+" "+bcount);
        
        
        
    }
}