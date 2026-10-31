import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;
        int previous = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();

            if (a != previous) {
                count++;
            }

            previous = a;
        }

        System.out.println(count);
    }
}
