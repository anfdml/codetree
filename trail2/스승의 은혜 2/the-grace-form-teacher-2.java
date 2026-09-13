import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int max = 0;
        for(int i=0;i<n;i++){ //학생중 한명 선택해서 반값 할인
            
            int sale = p[i]/2;
            if(sale>b) continue; 
            int count = 1;
            for(int j=0;j<n;j++){ //나머지 학생들 가격 더하기
                if(i==j)continue;
                if(sale+p[j]<=b){
                sale += p[j];
                count++;
                }else if(sale+p[j]>b){
                    break;
                }
            }
            max = Math.max(max, count);
        }
        System.out.print(max);

    }
}