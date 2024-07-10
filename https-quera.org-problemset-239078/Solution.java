import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}

	private static void app(){

		Scanner scanner = new Scanner(System.in);
		int[] lst = {0, 6, 5, 4, 3, 2, 1};
		int num = scanner.nextInt();
		System.out.print(lst[num]);
	}
}