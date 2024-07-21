import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String first = scanner.nextLine();

        String second = scanner.nextLine();

        int res = 0;

        for (int index = 0; index < num; index++)
            if (first.charAt(index) != second.charAt(index))
                res += 1;
        System.out.println(res);
    }

}
