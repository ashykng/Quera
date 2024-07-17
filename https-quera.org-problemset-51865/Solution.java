import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int res = scanner.nextInt();

        int days = scanner.nextInt();

        if (days == 0) {
            res = 20;
        } else if (days != 7) {
            res -= days;
        }

        if (res < 0) {
            res = 0;
        }

        System.out.println(res);
    }

}
