import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }


    public static void app() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        int a = 11 - r;
        int b;

        if (c >= 11) {
            System.out.print("Left ");
            b = 21 - c;
        } else {
            System.out.print("Right ");
            b = c;
        }

        System.out.println(a + " " + b);
    }

}
