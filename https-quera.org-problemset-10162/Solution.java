import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}
	
	private static void app(){
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    if(num % 2 == 1)
	        System.out.print("Payin Barare");
	   else
	        System.out.print("Bala Barare");
	}
}
