import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==2 || j==n-1) {
                    System.out.print(j+" ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}