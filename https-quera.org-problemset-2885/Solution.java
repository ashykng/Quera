import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}

	private static void app(){

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String str = "man khoshghlab hastam";
		for (int i = 0; i < num ; i++) 
		    System.out.println(str);
	}
}