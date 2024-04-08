import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int mid = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (mid==i || mid == j || mid>i && j==1 || mid<i && j==5 || mid<j && i==1 ||mid>j && i==5) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}