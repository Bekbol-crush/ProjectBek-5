import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 2; i < n; i++) {
            int c = sc.nextInt();

            if (b > a && b > c) {
                count++;
            }

            a = b;
            b = c;
        }

        System.out.println(count);
    }
}