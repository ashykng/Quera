import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
		app();
	}
	
	private static void app(){
	    Scanner scanner = new Scanner(System.in);
	    int num1 = scanner.nextInt();
	    int num2 = scanner.nextInt();
	    int num3 = scanner.nextInt();
	    int[] nums = {num1, num2, num3};
	    int maxNum = largest(nums);
	    int res = maxNum * maxNum;
	    for(int num: nums)
	        if(num != maxNum)
	            res -= num * num;
	    if(res == 0)
	        System.out.print("Yes");
	    else
	        System.out.print("No");
	}
	
	private static int largest(int[] arr){
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
         
        return max; 
    }
}
