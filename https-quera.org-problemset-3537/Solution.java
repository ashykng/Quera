import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}

	private static void app(){

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String res = "W";
		for (int i = 0; i < num ; i++) 
		    res += "o";
		res += "w!";
		System.out.print(res);
	}
}