import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==2 || i==n) {
                    System.out.print(i+" ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}