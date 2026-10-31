import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                int color = a[i];
                int j = i;

                while (j < n && a[j] == color) {
                    count++;
                    j++;
                }

                break;
            }
        }

        System.out.println(count);
    }
}
