import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        boolean containsZero = false;
        int sum = 0;
        for (int num : nums) {
            if (num == 0) {
                containsZero = true;
                break;
            }
            sum += num;
        }

        if (!containsZero && sum == 180) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
