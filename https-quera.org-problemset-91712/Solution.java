import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int distance = Math.abs(x2 - x1);

        if (x2 > x1)
            for (int i = 0; i < distance; i++)
                System.out.print("R");
        else if (x1 > x2)
            for (int i = 0; i < distance; i++)
                System.out.print("L");
        else
            System.out.println("Saal Noo Mobarak!");
    }
}
