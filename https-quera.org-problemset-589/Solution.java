import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}

	private static void app(){

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print(fak(num));
		
	}
	
	private static int fak(int num){
	    if(num <= 1)
	        return 1;
	    else{
	        return num * fak(--num);
	    }
	}
}