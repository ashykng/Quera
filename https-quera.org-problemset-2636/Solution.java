import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }
    public static void app() {
        Scanner scanner = new Scanner(System.in);

        int[] needed = {1, 1, 2, 2, 2, 8};
        int[] nums = new int[6];

        for (int i = 0; i < 6; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print((needed[i] - nums[i]) + " ");
        }
    }

}
