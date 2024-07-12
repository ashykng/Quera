import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		app();
	}
	
	private static void app(){
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    for(int i = 1; i <= num; i++){
	        for(int j = 1; j <= num; j++){
	            System.out.print(i * j + " ");
	        }
	       System.out.println();
	    }
	}
}
