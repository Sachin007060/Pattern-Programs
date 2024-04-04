import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 3 || i == n - 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}