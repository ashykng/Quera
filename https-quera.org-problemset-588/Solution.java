import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }

}
