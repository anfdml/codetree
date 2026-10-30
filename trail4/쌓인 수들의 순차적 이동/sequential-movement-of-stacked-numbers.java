import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[][] grid = new ArrayList[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = new ArrayList<>();
                grid[i][j].add(sc.nextInt());
            }
        }
        int dr[] = new int[] {-1, -1, 0, 1, 1, 1, 0, -1};
        int dc[] = new int[] {0, 1, 1, 1, 0, -1, -1, -1};

        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        for (int a = 0; a < m; a++) {
            boolean found = false;

            for (int i = 0; i < n && !found; i++) {
                for (int j = 0; j < n && !found; j++) {
                    for (int k = 0; k < grid[i][j].size(); k++) {
                        if (grid[i][j].get(k) == moves[a]) {
                            int max = 0;
                            int maxr = -1;
                            int maxc = -1;
                            for (int dir = 0; dir < 8; dir++) {
                                int nr = i + dr[dir];
                                int nc = j + dc[dir];
                                if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                                
                                for(int t =0; t< grid[nr][nc].size();t++){
                                    if(max < grid[nr][nc].get(t)){
                                        max= grid[nr][nc].get(t);
                                        maxr = nr;
                                        maxc = nc;
                                    }
                                }
                                
                            }
                            if(maxr != -1){
                                for(int t = k; t >= 0; t--){
                                    grid[maxr][maxc].add(0, grid[i][j].remove(t));
                                }
                            }
                            found  = true;
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0; i<n; i++ ){
            for(int j =0; j<n; j++){
                if(grid[i][j].isEmpty()){
                    System.out.println("None");
                }else{
                    for(int k = 0; k<grid[i][j].size();k++){
                        System.out.print(grid[i][j].get(k)+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
