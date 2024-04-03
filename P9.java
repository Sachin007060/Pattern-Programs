public class P9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int x = 65;
            for (int j = 1; j <= 5; j++) {
                System.out.print((char)x + " ");
                x++;
            }
            System.out.println();
        }
    }
}