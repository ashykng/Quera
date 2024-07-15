import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 0;

        while (Math.pow(2, res) <= num) {
            res += 1;
        }

        System.out.println((int) Math.pow(2, res));
    }

}
