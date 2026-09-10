import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        char[][] nm= new char[n][m]; //격자 생성 
        int dr[] = new int[] {-1, 1, 0, 0, -1, 1, 1, -1};//8방향 행
        int dc[] = new int[] {0, 0, -1, 1, 1, 1, -1, -1};//8방향 열 

        for(int i=0; i<n;i++){
            String str = arr[i];
            for(int j=0;j<m;j++){
                nm[i][j]=str.charAt(j);
            }
        }//배열안에 글자 넣기 
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nm[i][j]=='L'){
                    for(int k = 0; k< 8; k++){
                        int nnr= i+dr[k]+dr[k];
                        int nnc = j+dc[k]+dc[k];
                        if(nnr < 0 || nnr >= n || nnc < 0 || nnc >= m){
                            continue;
                        }else{
                            if(nm[i+dr[k]][j+dc[k]]=='E' && nm[i+dr[k]+dr[k]][j+dc[k]+dc[k]]=='E') 
                            count++;
                        }
                    }
                }
            }
        }//lee가 있는지 확인
        System.out.print(count);

    }//main
}
