import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt()+1000;
        int rect1_y1 = sc.nextInt()+1000;
        int rect1_x2 = sc.nextInt()+1000;
        int rect1_y2 = sc.nextInt()+1000;
        int rect2_x1 = sc.nextInt()+1000;
        int rect2_y1 = sc.nextInt()+1000;
        int rect2_x2 = sc.nextInt()+1000;
        int rect2_y2 = sc.nextInt()+1000;
        // Please write your code here.
        boolean[][] arr = new boolean[2001][2001];
        for (int i = rect1_x1; i < rect1_x2; i++) {
            for (int j = rect1_y1; j < rect1_y2; j++) {
                arr[i][j]=true;
            }
        }
        for (int i = rect2_x1; i < rect2_x2; i++) {
            for (int j = rect2_y1; j < rect2_y2; j++) {
                arr[i][j]=false;
            }
        }
        boolean found = false;
        int maxX = 0; int maxY= 0; 
        int minX = 10000; int minY =99999;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]) {
                    found =true;
                    if(i<minX) {
                        minX = i;
                    }
                    if(j<minY) {
                        minY = j;
                    }
                    if(i>maxX) {
                        maxX = i;
                    }
                    if(j>maxY) {
                        maxY = j;
                    }
                }
            }
        }
        
        int ans = (maxX-minX+1)*(maxY-minY+1);
        if(found) {
        System.out.print(ans);
        }else {
            System.out.print(0);
        }
        
    }
}