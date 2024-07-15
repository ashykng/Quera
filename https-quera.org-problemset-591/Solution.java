import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String firstLast = "*".repeat(num);

        System.out.println(firstLast);
        for (int i = 0; i < num - 2; i++) {
            System.out.print("*");
            System.out.print(" ".repeat(num - 2));
            System.out.println("*");
        }
        System.out.println(firstLast);
    }

}
