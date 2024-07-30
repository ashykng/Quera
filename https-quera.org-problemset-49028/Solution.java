import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int res = 0;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
            nums.add(scanner.nextInt());

        if (!nums.isEmpty()) {
            int last = nums.get(0);

            for (int num : nums) {
                if (num != last) {
                    last = num;
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
