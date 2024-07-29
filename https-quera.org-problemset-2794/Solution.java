import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (!x.contains(a)) {
                x.add(a);
            } else {
                x.remove(Integer.valueOf(a));
            }

            if (!y.contains(b)) {
                y.add(b);
            } else {
                y.remove(Integer.valueOf(b));
            }
        }

        System.out.print(x.get(0) + " " + y.get(0));
    }
}
