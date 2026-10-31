import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();

            if (a * b > 0) {
                System.out.println("YES");
                return;
            }

            a = b;
        }

        System.out.println("NO");
    }
}
