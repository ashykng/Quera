import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}
	
	

    private static void app() {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        while (num >= 10) {
            long sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.print(num);
    }
}