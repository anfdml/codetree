import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //사람수
        int M = sc.nextInt(); // 치즈수
        int D = sc.nextInt(); // 치즈먹은 기록 수
        int S = sc.nextInt(); // 아픈사람 수

        int[] eatPerson = new int[D]; //몇번재 사람
        int[] eatCheese = new int[D]; // 몇번째 치즈
        int[] eatTime = new int[D]; //언제먹었는지  //상한거면 1초뒤에 아픔
        for (int i = 0; i < D; i++) {
            eatPerson[i] = sc.nextInt();
            eatCheese[i] = sc.nextInt();
            eatTime[i] = sc.nextInt();
        }

        int[] sickPerson = new int[S]; // 몇번째 사람
        int[] sickTime = new int[S]; //언제 아팠는지
        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i <= M; i++) {
            boolean isok = true;
            for (int j = 0; j < S; j++) {
                boolean found = false;
                for(int k=0;k<D;k++){
                if (sickPerson[j] == eatPerson[k]
                    && i == eatCheese[k]
                    && eatTime[k] < sickTime[j]) {
                        found = true;
                        break;
                    }
            }
            
            if(!found){
                isok=false;
                break;
            }
            }
             if (isok) {
                boolean[] eat = new boolean[N+1];
                int count = 0;


                for (int k = 0; k < D; k++) {
                    if (i== eatCheese[k]) {
                        eat[eatPerson[k]] = true;
                    }
                }
                for (int l = 1; l < N + 1; l++) {
                    if (eat[l]) {
                        count++;
                    }
                }
                max = Math.max(max, count);
                
            }
        }
        System.out.print(max);
    }
}
