import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}

	private static void app(){

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num > 100)
		    System.out.print("Steam");
		else if (num < 0)
		    System.out.print("Ice");
		else{
		    System.out.print("Water");
		}
		
	}
}