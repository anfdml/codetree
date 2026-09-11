import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[101];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            arr[position] = ch;
        }
        int max = 0; 
        for(int i=0; i< arr.length;i++){ //전체 순회 
            for(int j = i; j<arr.length;j++){ // 확인하는 배열의 끝점  
            if(arr[i]==0 || arr[j]==0)continue;
            int hck = 0;
            int gch = 0;
            
                for(int k = i; k<=j;k++){ //배열안의 g h 확인 
                    if(arr[k]=='G') gch++; if(arr[k]=='H') hck++;
                }
                   int size = j-i; 

                if((gch==0&&hck!=0) ||(gch!=0&&hck==0)|| (gch==hck&&gch!=0 )){
                    max = Math.max(max, size);
                }
            }
        }
        System.out.print(max);
    }
}