import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++)
            n /= 2;

        System.out.println(n);
    }
}
