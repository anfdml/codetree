import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] allLine = new int[101];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            for (int j = a[i]; j <= b[i]; j++) {
                allLine[j]++;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean isok = true;
                    for (int l = a[i]; l <= b[i]; l++) {
                        allLine[l]--;
                    }
                    for (int l = a[j]; l <= b[j]; l++) {
                        allLine[l]--;
                    }
                    for (int l = a[k]; l <= b[k]; l++) {
                        allLine[l]--;
                    }
                    for (int l = 0; l < allLine.length; l++) {
                        if (allLine[l] >= 2) isok = false;
                    }
                    if (isok) {
                        count++;
                    }
                    for (int l = a[i]; l <= b[i]; l++) {
                        allLine[l]++;
                    }
                    for (int l = a[j]; l <= b[j]; l++) {
                        allLine[l]++;
                    }
                    for (int l = a[k]; l <= b[k]; l++) {
                        allLine[l]++;
                    }
                }
            }

        }
        System.out.print(count);

    }
}
