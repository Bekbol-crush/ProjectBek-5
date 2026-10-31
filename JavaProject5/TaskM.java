import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = a - 1; i < b / 2 + a / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[a + b - 2 - i];
            arr[a + b - 2 - i] = temp;
        }

        for (int i = c - 1; i < (c + d - 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[c + d - 2 - i];
            arr[c + d - 2 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
