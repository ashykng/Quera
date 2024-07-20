import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int l = scanner.nextInt();

        int res = 0;

        for (int i = 1; i <= l; i++) {
            if (i % 2 == 1) {
                res += a;
            } else {
                res += b;
            }
        }

        System.out.println(res);
    }

}
