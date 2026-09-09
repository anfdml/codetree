import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r = 0;
        int c = 0;
        boolean win = false;
        for (int i = 0; i < 19 && !win; i++) {
            for (int j = 2; j < 17&& !win; j++) {
                if (arr[i][j - 2] == 2 && arr[i][j - 1] == 2 &&arr[i][j] == 2&&arr[i][j + 1] == 2&&arr[i][j + 2]==2) {
                    r = i; c = j;
                    win = true;
                    System.out.println(2);
                }else if (arr[i][j - 2] ==1&& arr[i][j - 1] ==1&& arr[i][j] ==1&& arr[i][j + 1] == 1&&arr[i][j + 2]==1){
                     System.out.println(1);
                    r = i; c = j;
                    win = true;
                }
            }
        }
        for (int i = 0; i < 19&& !win; i++) {
            for (int j = 2; j < 17&& !win; j++) {
                if (arr[j - 2][i] ==1&& arr[j - 1][i] ==1&& arr[j][i] ==1&& arr[j + 1][i] ==1&& arr[j + 2][i]==1) {
                   System.out.println(1);
                   r = j; c = i;
                    win = true;    
                }else if(arr[j - 2][i] ==2&& arr[j - 1][i] == 2&&arr[j][i] ==2&& arr[j + 1][i] == 2&&arr[j + 2][i]==2){
                    System.out.println(2);
                    r = j; c = i;
                    win = true;  
                }
            }
        }
        for (int i = 2; i < 17 && !win; i++) {
    for (int j = 2; j < 17 && !win; j++) {

        if (arr[i - 2][j - 2] == 1 && arr[i - 1][j - 1] == 1 &&arr[i][j] == 1 && arr[i + 1][j + 1] == 1 && arr[i + 2][j + 2] == 1) {
            System.out.println(1);
            r = i;
            c = j;
            win = true;
        } else if (arr[i - 2][j - 2] == 2 && arr[i - 1][j - 1] == 2 && arr[i][j] == 2 && arr[i + 1][j + 1] == 2 && arr[i + 2][j + 2] == 2) {
            System.out.println(2);
            r = i;
            c = j;
            win = true;
        }
    }
}
for (int i = 2; i < 17 && !win; i++) {
    for (int j = 2; j < 17 && !win; j++) {

        if (arr[i - 2][j + 2] == 1 && arr[i - 1][j + 1] == 1 && arr[i][j] == 1 &&arr[i + 1][j - 1] == 1 &&arr[i + 2][j - 2] == 1) {
            System.out.println(1);
            r = i;
            c = j;
            win = true;
        } else if (arr[i - 2][j + 2] == 2 && arr[i - 1][j + 1] == 2 &&arr[i][j] == 2 && arr[i + 1][j - 1] == 2 && arr[i + 2][j - 2] == 2) {
            System.out.println(2);
            r = i;
            c = j;
            win = true;
        }
    }
}
        
        if(!win) System.out.print(0);
        else System.out.print((r+1)+" "+(c+1));
    }
}
