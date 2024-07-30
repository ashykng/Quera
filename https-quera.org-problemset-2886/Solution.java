import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (h != 0)
            h = 12 - h;
        if (m != 0)
            m = 60 - m;

        System.out.printf("%02d:%02d%n", h, m);
    }
}
